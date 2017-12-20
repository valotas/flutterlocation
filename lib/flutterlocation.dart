import 'dart:async';

import 'package:flutter/services.dart';

class Flutterlocation {
  static const MethodChannel _channel =
      const MethodChannel('flutterlocation');

  static Future<String> get platformVersion =>
      _channel.invokeMethod('getPlatformVersion');
}
