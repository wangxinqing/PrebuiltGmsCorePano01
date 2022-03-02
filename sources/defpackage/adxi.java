package defpackage;

import android.content.Context;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

/* renamed from: adxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adxi extends adwu {
    public final void a(SecurePaymentsPayload securePaymentsPayload) {
        this.a.putExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) this.a.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] byteArrayExtra = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z5 = true;
        if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        byte[] byteArrayExtra2 = this.a.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        if (byteArrayExtra2 == null || byteArrayExtra2.length <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (securePaymentsPayload != null) {
            z3 = true;
        } else {
            z3 = z || z2;
        }
        iva.b(z3, "One of SecurePaymentsPayload, encrypted parameters, or unencrypted parameters required");
        if (securePaymentsPayload != null) {
            byte[] bArr = securePaymentsPayload.a;
            if (bArr == null || bArr.length == 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            iva.b(z4, "SecurePaymentsPayload requires an opaque token");
            if (z) {
                z5 = false;
            } else if (z2) {
                z5 = false;
            }
            iva.b(z5, "Can't have both SecurePaymentsPayload and either encrypted or unencrypted parameters");
        }
    }

    public adxi(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER", "flow_pm", true);
    }
}
