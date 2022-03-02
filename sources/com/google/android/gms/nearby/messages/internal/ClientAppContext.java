package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vbx();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    @Deprecated
    public final int e;
    public final String f;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.a = i;
        iva.a((Object) str);
        this.b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[]{str2, "0p:"}));
            str2 = str2.length() == 0 ? new String("0p:") : "0p:".concat(str2);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    public static int a(int i, ClientAppContext clientAppContext) {
        return i == 0 ? clientAppContext.e : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientAppContext) {
            ClientAppContext clientAppContext = (ClientAppContext) obj;
            return a(this.b, clientAppContext.b) && a(this.c, clientAppContext.c) && this.d == clientAppContext.d && a(this.f, clientAppContext.f) && this.e == clientAppContext.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    static final ClientAppContext a(ClientAppContext clientAppContext, String str, String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new ClientAppContext(str, str2, z, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, a2);
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public ClientAppContext(String str) {
        this(str, (String) null);
    }

    public ClientAppContext(String str, String str2) {
        this(str, str2, false, 0);
    }

    public ClientAppContext(String str, String str2, boolean z, int i) {
        this(1, str, str2, z, i, (String) null);
    }
}
