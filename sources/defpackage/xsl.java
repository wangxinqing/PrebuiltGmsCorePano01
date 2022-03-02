package defpackage;

import android.content.ContentResolver;
import android.widget.CompoundButton;

/* renamed from: xsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsl implements CompoundButton.OnCheckedChangeListener {
    private final xst a;

    public xsl(xst xst) {
        this.a = xst;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        xst xst = this.a;
        ContentResolver.setSyncAutomatically(xst.a, "com.android.contacts", z);
        xst.a(6, z);
        if (ayqr.a.a().k() && !z) {
            ContentResolver.cancelSync(xst.a, "com.android.contacts");
        }
    }
}
