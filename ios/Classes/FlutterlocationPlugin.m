#import "FlutterlocationPlugin.h"
#import <flutterlocation/flutterlocation-Swift.h>

@implementation FlutterlocationPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterlocationPlugin registerWithRegistrar:registrar];
}
@end
