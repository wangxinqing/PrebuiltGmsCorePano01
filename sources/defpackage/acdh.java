package defpackage;

import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: acdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acdh implements acvs {
    private final acdr a;

    public acdh(acdr acdr) {
        this.a = acdr;
    }

    public final void a(Exception exc) {
        acdr acdr = this.a;
        acdr.a.e("Failed to enable target mode.", exc, new Object[0]);
        if (exc instanceof ibr) {
            int a2 = ((ibr) exc).a();
            acdr.i.b.add(Integer.valueOf(a2));
            Activity activity = acdr.getActivity();
            if (activity != null && a2 != 10551) {
                Toast.makeText(activity, R.string.common_something_went_wrong, 1).show();
                activity.finish();
            }
        }
    }
}
