package com.valotas.flutter.location

import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.PluginRegistry.Registrar

class FlutterlocationPlugin() : MethodCallHandler {
    companion object {
        @JvmStatic
        fun registerWith(registrar: Registrar): Unit {
            val channel = MethodChannel(registrar.messenger(), "flutterlocation")
            channel.setMethodCallHandler(FlutterlocationPlugin())
        }
    }

    override fun onMethodCall(call: MethodCall, result: Result): Unit {
        if (call.method.equals("getPlatformVersion")) {
            result.success("Android ${android.os.Build.VERSION.RELEASE}")
        } else if (call.method.equals("getCurrentLocation")) {
            result.success(getCurrentLocation())
        } else {
            result.notImplemented()
        }
    }

    private fun getCurrentLocation(): Map<String, String> {
        val loc = HashMap<String, String>()
        loc.put("longtitute", "0")
        loc.put("latitude", "0")
        return loc
    }
}
