package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hxd();
    public static final ConnectionResult a = new ConnectionResult(0);
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                        return "CANCELED";
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                        return "TIMEOUT";
                    case Service.START_CONTINUATION_MASK:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionResult) {
            ConnectionResult connectionResult = (ConnectionResult) obj;
            return this.c == connectionResult.c && ius.a(this.d, connectionResult.d) && ius.a(this.e, connectionResult.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("statusCode", a(this.c));
        a2.a("resolution", this.d);
        a2.a("message", this.e);
        return a2.toString();
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public final void a(Activity activity) {
        if (a()) {
            activity.startIntentSenderForResult(this.d.getIntentSender(), 1, (Intent) null, 0, 0, 0);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.b);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d, i, false);
        ivx.a(parcel, 4, this.e, false);
        ivx.b(parcel, a2);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
