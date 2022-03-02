package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: adth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adth extends isy {
    public static final /* synthetic */ int a = 0;
    private final AtomicReference u = new AtomicReference();

    public final Feature[] D() {
        return adru.c;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        if (queryLocalInterface instanceof adsv) {
            return (adsv) queryLocalInterface;
        }
        return new adst(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    public final int d() {
        return 12600000;
    }

    public final void j() {
        try {
            adsr adsr = (adsr) this.u.getAndSet((Object) null);
            if (adsr != null) {
                ((adsv) x()).b(adsr, new adtb());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.j();
    }

    public adth(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 41, ise, ica, icb);
    }

    public final void a(adsr adsr, adsr adsr2, idg idg) {
        adtf adtf = new adtf((adsv) x(), idg, adsr2);
        if (adsr != null) {
            ((adsv) x()).c(adsr, adtf);
        } else if (adsr2 != null) {
            ((adsv) x()).a((adss) adsr2, (adsp) adtf);
        } else {
            idg.a((Object) Status.a);
        }
    }

    public final void a(String str, byte[] bArr, String str2, int[] iArr, int i, Context context, ConsentInformation consentInformation, acwd acwd) {
        if (azuc.a.a().a()) {
            String str3 = str;
            ((adsv) x()).a(str, (adsp) new adta((adsv) x(), str, bArr, str2, iArr, i, context, acwd));
            return;
        }
        String str4 = str;
        String str5 = str2;
        ((adsv) x()).a(str2, consentInformation, new adtd(str, bArr, iArr, i, context, acwd));
    }
}
