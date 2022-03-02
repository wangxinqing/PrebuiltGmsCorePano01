package defpackage;

import android.opengl.GLES20;
import org.webrtc.Logging;

/* renamed from: baxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxg {
    private int a;

    public baxg(String str, String str2) {
        int a2 = a(35633, str);
        int a3 = a(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(this.a, a3);
            GLES20.glLinkProgram(this.a);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.a));
                Logging.b("GlShader", valueOf.length() == 0 ? new String("Could not link program: ") : "Could not link program: ".concat(valueOf));
                throw new RuntimeException(GLES20.glGetProgramInfoLog(this.a));
            }
            GLES20.glDeleteShader(a2);
            GLES20.glDeleteShader(a3);
            baxi.a("Creating GlShader");
            return;
        }
        int glGetError = GLES20.glGetError();
        StringBuilder sb = new StringBuilder(51);
        sb.append("glCreateProgram() failed. GLES20 error: ");
        sb.append(glGetError);
        throw new RuntimeException(sb.toString());
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                baxi.a("compileShader");
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 26 + String.valueOf(str).length());
            sb.append("Compile error ");
            sb.append(glGetShaderInfoLog);
            sb.append(" in shader:\n");
            sb.append(str);
            Logging.b("GlShader", sb.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int glGetError = GLES20.glGetError();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("glCreateShader() failed. GLES20 error: ");
        sb2.append(glGetError);
        throw new RuntimeException(sb2.toString());
    }

    public final int b(String str) {
        int i = this.a;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder sb = new StringBuilder(str.length() + 38);
            sb.append("Could not locate uniform '");
            sb.append(str);
            sb.append("' in program");
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    public final void b() {
        Logging.a("GlShader", "Deleting shader.");
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.a = -1;
        }
    }

    public final int a(String str) {
        int i = this.a;
        if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Could not locate '");
            sb.append(str);
            sb.append("' in program");
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    public final void a() {
        int i = this.a;
        if (i != -1) {
            GLES20.glUseProgram(i);
            baxi.a("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
