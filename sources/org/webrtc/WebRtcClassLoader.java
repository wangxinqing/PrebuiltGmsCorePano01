package org.webrtc;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class WebRtcClassLoader {
    WebRtcClassLoader() {
    }

    static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new RuntimeException("Failed to get WebRTC class loader.");
    }
}
