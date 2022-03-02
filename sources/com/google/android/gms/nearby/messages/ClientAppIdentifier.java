package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClientAppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uwm();
    public static final ClientAppIdentifier a = a("com.google.android.gms", new ClientAppContext("com.google.android.gms", "0p:com.google.android.gms"));
    final int b;
    public final ClientAppContext c;
    public final String d;
    public int e;

    public ClientAppIdentifier(int i, ClientAppContext clientAppContext, String str, int i2) {
        this.b = i;
        this.c = clientAppContext;
        this.d = str;
        this.e = i2;
    }

    public static ClientAppIdentifier a(String str) {
        return a(str, new ClientAppContext(str));
    }

    public static boolean b(String str) {
        return "com.google.android.gms".equals(str);
    }

    public final boolean a(int i) {
        return (i & this.e) != 0;
    }

    public final String c() {
        if (b()) {
            return this.c.c;
        }
        return this.c.b;
    }

    public final boolean d() {
        if (b()) {
            return uxv.a(this.c.c);
        }
        return uxv.a(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientAppIdentifier) {
            ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) obj;
            if (a(this.c.b, clientAppIdentifier.c.b) && a(this.c.c, clientAppIdentifier.c.c)) {
                ClientAppContext clientAppContext = this.c;
                boolean z = clientAppContext.d;
                ClientAppContext clientAppContext2 = clientAppIdentifier.c;
                return z == clientAppContext2.d && clientAppContext.e == clientAppContext2.e;
            }
        }
    }

    public final int hashCode() {
        ClientAppContext clientAppContext = this.c;
        return Arrays.hashCode(new Object[]{clientAppContext.b, clientAppContext.c, Boolean.valueOf(clientAppContext.d), Integer.valueOf(this.c.e)});
    }

    public final String toString() {
        if (!b()) {
            return this.c.b;
        }
        ClientAppContext clientAppContext = this.c;
        String str = clientAppContext.b;
        String str2 = clientAppContext.c;
        boolean z = clientAppContext.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        sb.append("#");
        sb.append(z);
        return sb.toString();
    }

    public static ClientAppIdentifier a(String str, ClientAppContext clientAppContext) {
        return new ClientAppIdentifier(1, clientAppContext, str, 0);
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.c.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, i, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, 4, this.e);
        ivx.b(parcel, a2);
    }

    public final boolean c(String str) {
        String str2;
        ClientAppContext clientAppContext = this.c;
        if (clientAppContext == null || (str2 = clientAppContext.c) == null) {
            return false;
        }
        return str2.equals(str);
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return TextUtils.isEmpty(str2);
        }
        return str.equals(str2);
    }

    public final String a() {
        return !b() ? this.c.b : "com.google.android.gms";
    }
}
