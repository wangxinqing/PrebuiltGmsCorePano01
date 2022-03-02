package com.google.android.gms.smartdevice.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SerializableNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = new acgd();
    private static final iwd m = acqa.a("Notification", "SerializableNotification");
    public long a;
    public long b;
    public long c;
    public CharSequence d;
    public Uri e;
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    public int i;
    public CharSequence j;
    public boolean k;
    public boolean l;

    public SerializableNotification() {
    }

    public static SerializableNotification a(SerializableNotification serializableNotification) {
        return a(serializableNotification.a());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        TextUtils.writeToParcel(this.d, parcel, i2);
        Uri uri = this.e;
        parcel.writeString(uri != null ? uri.toString() : null);
        TextUtils.writeToParcel(this.f, parcel, i2);
        TextUtils.writeToParcel(this.g, parcel, i2);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, i2);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public SerializableNotification(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        this.e = readString != null ? Uri.parse(readString) : null;
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        boolean z = true;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() == 0 ? false : z;
    }

    public static SerializableNotification a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            SerializableNotification serializableNotification = new SerializableNotification();
            serializableNotification.a = jSONObject.optLong("notify_time");
            serializableNotification.b = jSONObject.optLong("max_duration");
            serializableNotification.c = jSONObject.optLong("delay");
            serializableNotification.d = jSONObject.optString("big_text");
            serializableNotification.e = Uri.parse(jSONObject.optString("content_intent_view"));
            serializableNotification.f = jSONObject.optString("content_text");
            serializableNotification.g = jSONObject.optString("content_title");
            serializableNotification.h = jSONObject.optBoolean("key_ongoing");
            serializableNotification.i = jSONObject.optInt("small_icon");
            serializableNotification.j = jSONObject.optString("ticker");
            serializableNotification.k = jSONObject.optBoolean("auto_cancel");
            serializableNotification.l = jSONObject.optBoolean("local_only");
            return serializableNotification;
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static SerializableNotification a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        return (SerializableNotification) CREATOR.createFromParcel(obtain);
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e2) {
            m.d("JSONException putting field into object!", e2, new Object[0]);
        }
    }

    public final Notification a(Context context) {
        je jeVar = new je(context);
        if (this.d != null) {
            jd jdVar = new jd();
            jdVar.a(this.d);
            jeVar.a((jh) jdVar);
        }
        Uri uri = this.e;
        if (uri != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            jeVar.f = PendingIntent.getActivity(context, 0, intent, 134217728);
        }
        jeVar.b(this.f);
        jeVar.e(this.g);
        jeVar.b(this.h);
        jeVar.b(this.i);
        jeVar.d(this.j);
        jeVar.a(this.k);
        jeVar.r = this.l;
        return jeVar.b();
    }

    public final String a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "notify_time", String.valueOf(this.a));
        a(jSONObject, "max_duration", String.valueOf(this.b));
        a(jSONObject, "delay", String.valueOf(this.c));
        CharSequence charSequence = this.d;
        String str3 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        a(jSONObject, "big_text", str);
        Uri uri = this.e;
        if (uri != null) {
            str2 = uri.toString();
        } else {
            str2 = null;
        }
        a(jSONObject, "content_intent_view", str2);
        CharSequence charSequence2 = this.f;
        a(jSONObject, "content_text", charSequence2 != null ? charSequence2.toString() : null);
        CharSequence charSequence3 = this.g;
        a(jSONObject, "content_title", charSequence3 != null ? charSequence3.toString() : null);
        a(jSONObject, "key_ongoing", Boolean.valueOf(this.h));
        a(jSONObject, "small_icon", Integer.valueOf(this.i));
        CharSequence charSequence4 = this.j;
        if (charSequence4 != null) {
            str3 = charSequence4.toString();
        }
        a(jSONObject, "ticker", str3);
        a(jSONObject, "auto_cancel", Boolean.valueOf(this.k));
        a(jSONObject, "local_only", Boolean.valueOf(this.l));
        return jSONObject.toString();
    }
}
