package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: baxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baxf {
    private static final FloatBuffer c = baxi.a(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer d = baxi.a(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    public baxg a;
    public int b;
    private final String e = "void main() {\n  gl_FragColor = sample(tc);\n}\n";
    private final String f = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private int g;
    private int h;
    private int i;

    public final void a(int i2, float[] fArr) {
        baxg baxg;
        if (i2 != this.b) {
            this.b = i2;
            baxg baxg2 = this.a;
            if (baxg2 != null) {
                baxg2.b();
            }
            String str = this.f;
            String str2 = this.e;
            StringBuilder sb = new StringBuilder();
            if (i2 == 1) {
                sb.append("#extension GL_OES_EGL_image_external : require\n");
            }
            sb.append("precision mediump float;\nvarying vec2 tc;\n");
            String str3 = i2 != 1 ? "sampler2D" : "samplerExternalOES";
            sb.append("uniform ");
            sb.append(str3);
            sb.append(" tex;\n");
            sb.append(str2.replace("sample(", "texture2D(tex, "));
            baxg = new baxg(str, sb.toString());
            this.a = baxg;
            baxg.a();
            GLES20.glUniform1i(baxg.b("tex"), 0);
            baxi.a("Create shader");
            this.i = baxg.b("tex_mat");
            this.g = baxg.a("in_pos");
            this.h = baxg.a("in_tc");
        } else {
            baxg = this.a;
        }
        baxg.a();
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, c);
        GLES20.glEnableVertexAttribArray(this.h);
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 0, d);
        GLES20.glUniformMatrix4fv(this.i, 1, false, fArr, 0);
        baxi.a("Prepare shader");
    }
}
