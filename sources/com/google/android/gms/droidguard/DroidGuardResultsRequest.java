package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DroidGuardResultsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lyo();
    private static final int b = ((int) TimeUnit.SECONDS.toMillis(60));
    public Bundle a;

    public DroidGuardResultsRequest() {
        String str;
        this.a = new Bundle();
        a(hxj.b);
        try {
            str = System.getProperty("os.arch");
        } catch (Exception e) {
            str = "?";
        }
        this.a.putString("appArchitecture", str);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void a(int i) {
        this.a.putInt("clientVersion", i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }

    public DroidGuardResultsRequest(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
