package com.google.android.gms.drive.auth;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppIdentity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new khj();
    public static final AppIdentity a = new AppIdentity("com.google.android.gms", true, "");
    public final String b;
    public final String c;
    private final boolean d;

    private AppIdentity(String str, boolean z, String str2) {
        iva.a((Object) str);
        this.b = str;
        this.d = z;
        String str3 = "";
        if (!z && !str3.equals(str2)) {
            str3 = lru.a(str2, 40);
        }
        this.c = str3;
    }

    public static AppIdentity a(String str, String str2) {
        return new AppIdentity(str, false, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            AppIdentity appIdentity = (AppIdentity) obj;
            return this.b.equals(appIdentity.b) && this.c.equals(appIdentity.c);
        }
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(str2).length());
        sb.append("AppIdentity [packageName=");
        sb.append(str);
        sb.append(", hash=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.d ? (byte) 1 : 0);
        if (!this.d) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    public static AppIdentity a(JSONObject jSONObject) {
        return !jSONObject.getBoolean("isSuperuser") ? a(jSONObject.getString("packageName"), jSONObject.getString("hash")) : a;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuperuser", this.d);
        if (!this.d) {
            jSONObject.put("packageName", this.b);
            jSONObject.put("hash", this.c);
        }
        return jSONObject;
    }
}
