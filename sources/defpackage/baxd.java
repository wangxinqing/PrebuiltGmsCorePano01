package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import org.webrtc.Logging;

/* renamed from: baxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxd implements baxb {
    public EGLContext a;
    public EGLConfig b;
    public EGLDisplay c;
    public EGLSurface d = EGL14.EGL_NO_SURFACE;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public baxd(int[] iArr) {
        int i;
        EGLContext eglCreateContext;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            String valueOf = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf.length() == 0 ? new String("Unable to get EGL14 display: 0x") : "Unable to get EGL14 display: 0x".concat(valueOf));
        }
        int[] iArr2 = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
            String valueOf2 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Unable to initialize EGL14: 0x") : "Unable to initialize EGL14: 0x".concat(valueOf2));
        }
        this.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        if (!EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
            String valueOf3 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
            throw new RuntimeException(valueOf3.length() == 0 ? new String("eglChooseConfig failed: 0x") : "eglChooseConfig failed: 0x".concat(valueOf3));
        } else if (iArr3[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                this.b = eGLConfig;
                int i2 = 0;
                while (true) {
                    if (i2 >= iArr.length - 1) {
                        i = 1;
                        break;
                    } else if (iArr[i2] != 12352) {
                        i2++;
                    } else {
                        int i3 = iArr[i2 + 1];
                        i = i3 != 4 ? i3 != 64 ? 1 : 3 : 2;
                    }
                }
                StringBuilder sb = new StringBuilder(35);
                sb.append("Using OpenGL ES version ");
                sb.append(i);
                Logging.a("EglBase14Impl", sb.toString());
                EGLDisplay eGLDisplay = this.c;
                EGLConfig eGLConfig2 = this.b;
                int[] iArr4 = {12440, i, 12344};
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                synchronized (baxe.e) {
                    eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig2, eGLContext, iArr4, 0);
                }
                if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    String valueOf4 = String.valueOf(Integer.toHexString(EGL14.eglGetError()));
                    throw new RuntimeException(valueOf4.length() == 0 ? new String("Failed to create EGL context: 0x") : "Failed to create EGL context: 0x".concat(valueOf4));
                } else {
                    this.a = eglCreateContext;
                }
            } else {
                throw new RuntimeException("eglChooseConfig returned null");
            }
        } else {
            throw new RuntimeException("Unable to find any matching EGL config");
        }
    }

    public final void a() {
        if (this.c == EGL14.EGL_NO_DISPLAY || this.a == EGL14.EGL_NO_CONTEXT || this.b == null) {
            throw new RuntimeException("This object has been released");
        }
    }
}
