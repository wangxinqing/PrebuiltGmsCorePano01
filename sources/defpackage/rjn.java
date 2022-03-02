package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Locale;

/* renamed from: rjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjn extends isy {
    public final PlacesParams a;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        if (queryLocalInterface instanceof rju) {
            return (rju) queryLocalInterface;
        }
        return new rjs(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    public final int d() {
        return 12451000;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjn(Context context, Looper looper, ise ise, ica ica, icb icb, String str, rir rir) {
        super(context, looper, 65, ise, ica, icb);
        String str2;
        rir rir2 = rir;
        Locale locale = Locale.getDefault();
        String str3 = rir2.d;
        if (str3 != null) {
            str2 = str3;
        } else {
            Account account = ise.a;
            str2 = account != null ? account.name : null;
        }
        this.a = new PlacesParams(str, locale, str2, rir2.b, rir2.c);
    }
}
