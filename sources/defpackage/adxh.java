package defpackage;

import android.content.Context;

/* renamed from: adxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxh extends adwu {
    public adxh(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        boolean z = true;
        if (this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        iva.b(z, "Either buyflow params or initialization token is required");
    }
}
