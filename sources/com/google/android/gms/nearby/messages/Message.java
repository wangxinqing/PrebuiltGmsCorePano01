package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Message extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new uxe();
    private static final NearbyDevice[] g = {NearbyDevice.a};
    final int a;
    public final byte[] b;
    public final String c;
    public final String d;
    @Deprecated
    final NearbyDevice[] e;
    public final long f;

    public Message(int i, byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        boolean z;
        boolean z2;
        this.a = i;
        iva.a((Object) str2);
        this.c = str2;
        this.d = str == null ? "" : str;
        this.f = j;
        iva.a((Object) bArr);
        int length = bArr.length;
        if (length <= 102400) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(length), 102400);
        this.b = bArr;
        this.e = (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) ? g : nearbyDeviceArr;
        if (str2.length() <= 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public final boolean a() {
        return "__reserved_namespace".equals(this.d);
    }

    public final boolean b() {
        return a("__audio_bytes");
    }

    @Deprecated
    public final NearbyDevice c() {
        return this.e[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            return TextUtils.equals(this.d, message.d) && TextUtils.equals(this.c, message.c) && Arrays.equals(this.b, message.b) && this.f == message.f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.c, Integer.valueOf(Arrays.hashCode(this.b)), Long.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.c;
        byte[] bArr = this.b;
        int length = bArr != null ? bArr.length : 0;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59 + String.valueOf(str2).length());
        sb.append("Message{namespace='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', content=[");
        sb.append(length);
        sb.append(" bytes]}");
        return sb.toString();
    }

    public final boolean a(String str) {
        return a() && str.equals(this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, (Parcelable[]) this.e, i);
        ivx.a(parcel, 5, this.f);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice nearbyDevice) {
        this(bArr, str, str2, new NearbyDevice[]{nearbyDevice}, 0);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this(2, bArr, str, str2, nearbyDeviceArr, j);
    }
}
