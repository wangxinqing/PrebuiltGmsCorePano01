package defpackage;

import android.os.Bundle;

/* renamed from: ohu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohu {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public Bundle e = new Bundle();

    public final ohw a() {
        ohw ohw = new ohw();
        Bundle bundle = new Bundle();
        bundle.putInt("title_res_id", this.a);
        bundle.putInt("message_res_id", this.b);
        bundle.putInt("positive_button_text_res_id", this.c);
        bundle.putInt("negative_button_text_res_id", this.d);
        bundle.putInt("button_text_color_res_id", -1);
        bundle.putBundle("extra_args", this.e);
        ohw.setArguments(bundle);
        return ohw;
    }
}
