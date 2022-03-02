package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: yzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yzl extends yxu {
    private String a;
    private String b;
    private String c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.a = arguments.getString("secureUrl");
        this.b = arguments.getString("prettyUrl");
        this.c = arguments.getString("title");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new yzk(getActivity(), this.a, this.b, this.c);
    }
}
