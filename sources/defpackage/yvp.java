package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: yvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvp extends irq {
    private final ConnectionResult a;
    private final ParcelFileDescriptor b;

    public yvp(ywg ywg, PlusImageView plusImageView, ConnectionResult connectionResult, ParcelFileDescriptor parcelFileDescriptor) {
        super(ywg, plusImageView);
        this.a = connectionResult;
        this.b = parcelFileDescriptor;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        PlusImageView plusImageView = (PlusImageView) obj;
        ConnectionResult connectionResult = this.a;
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (connectionResult.b()) {
            plusImageView.c = false;
            if (parcelFileDescriptor != null) {
                new ysv(plusImageView, plusImageView.a).execute(new ParcelFileDescriptor[]{parcelFileDescriptor});
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            jjt.a(parcelFileDescriptor);
        }
    }
}
