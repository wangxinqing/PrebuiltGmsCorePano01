package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Locale;

/* renamed from: rki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rki extends isy {
    public final PlacesParams a;
    private final Locale u = Locale.getDefault();

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
        if (queryLocalInterface instanceof rjr) {
            return (rjr) queryLocalInterface;
        }
        return new rjp(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    public final int d() {
        return 12451000;
    }

    public rki(Context context, Looper looper, ise ise, ica ica, icb icb, String str, rir rir) {
        super(context, looper, 67, ise, ica, icb);
        String str2;
        String str3 = rir.d;
        if (str3 != null) {
            str2 = str3;
        } else {
            Account account = ise.a;
            str2 = account != null ? account.name : null;
        }
        this.a = new PlacesParams(str, this.u, str2, rir.b, rir.c);
    }
}
