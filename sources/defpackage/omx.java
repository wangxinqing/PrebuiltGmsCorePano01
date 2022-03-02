package defpackage;

import android.util.Log;
import android.view.View;
import org.json.JSONException;

/* renamed from: omx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class omx implements View.OnClickListener {
    private final onb a;
    private final String b;
    private final String c;
    private final int d;
    private final omv e;

    public omx(onb onb, String str, String str2, int i, omv omv) {
        this.a = onb;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = omv;
    }

    public void onClick(View view) {
        onb onb = this.a;
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        omv omv = this.e;
        try {
            onb.a.s.i.clearFocus();
            oay.a(view);
            oab b2 = oab.b(str, str2);
            if (b2.o()) {
                oad.a(b2, onb.a);
            } else if (b2.n()) {
                oad.a(new oho(), b2, onb.a);
            } else if (b2.m()) {
                oad.a(new oah(onb.a), b2, i, 32, b2.d);
            }
        } catch (JSONException e2) {
            Log.e("AutoCompleteSgstAdapter", "Opening help action failed:", e2);
        }
        onb.a(onb.e, omv);
    }
}
