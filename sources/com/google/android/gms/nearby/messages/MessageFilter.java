package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uxg();
    public static final MessageFilter a;
    final int b;
    public final List c;
    public final List d;
    public final boolean e;
    public final List f;
    public final int g;

    static {
        uxf uxf = new uxf();
        uxf.a = true;
        a = uxf.a();
    }

    public MessageFilter(int i, List list, List list2, boolean z, List list3, int i2) {
        this.b = i;
        iva.a((Object) list);
        this.c = Collections.unmodifiableList(list);
        this.e = z;
        this.d = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
        this.f = Collections.unmodifiableList(list3 == null ? Collections.emptyList() : list3);
        this.g = i2;
    }

    public final boolean a() {
        return this.g > 0;
    }

    public final boolean b() {
        if (this.e) {
            return true;
        }
        for (MessageType messageType : this.c) {
            if (!"__reserved_namespace".equals(messageType.b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageFilter) {
            MessageFilter messageFilter = (MessageFilter) obj;
            return this.e == messageFilter.e && ius.a(this.c, messageFilter.c) && ius.a(this.d, messageFilter.d) && ius.a(this.f, messageFilter.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, Boolean.valueOf(this.e), this.f});
    }

    public final String toString() {
        boolean z = this.e;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final boolean a(Message message) {
        int i;
        UUID uuid;
        int i2;
        Message message2 = message;
        if (message2 == null) {
            return false;
        }
        if ((!this.e || message.a()) && !this.c.contains(new MessageType(message2.d, message2.c))) {
            return false;
        }
        if (!message.a()) {
            return true;
        }
        for (NearbyDeviceFilter nearbyDeviceFilter : this.d) {
            int i3 = nearbyDeviceFilter.b;
            if (!message2.a("__eddystone_uid")) {
                i2 = message2.a("__i_beacon_id") ? 3 : 1;
            } else {
                i2 = 2;
            }
            if (i3 == i2) {
                byte[] bArr = nearbyDeviceFilter.c;
                byte[] bArr2 = message2.b;
                if (!(bArr2 == null || bArr == null || bArr2.length < bArr.length)) {
                    int i4 = 0;
                    while (i4 < bArr.length) {
                        if (bArr[i4] == bArr2[i4]) {
                            i4++;
                        }
                    }
                    return true;
                }
            }
            if (message2.a("__eddystone_url") && nearbyDeviceFilter.d) {
                return true;
            }
        }
        for (BleFilter bleFilter : this.f) {
            if ("__reserved_namespace".equals(message2.d) && "__ble_record".equals(message2.c)) {
                uzx a2 = uzx.a(message);
                ParcelUuid parcelUuid = bleFilter.b;
                if (parcelUuid != null) {
                    ParcelUuid parcelUuid2 = bleFilter.c;
                    List list = a2.a;
                    if (list != null) {
                        if (parcelUuid2 != null) {
                            uuid = parcelUuid2.getUuid();
                        } else {
                            uuid = null;
                        }
                        int size = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                continue;
                                break;
                            }
                            UUID uuid2 = parcelUuid.getUuid();
                            UUID uuid3 = ((ParcelUuid) list.get(i5)).getUuid();
                            if (uuid != null) {
                                if ((uuid2.getLeastSignificantBits() & uuid.getLeastSignificantBits()) == (uuid3.getLeastSignificantBits() & uuid.getLeastSignificantBits()) && (uuid2.getMostSignificantBits() & uuid.getMostSignificantBits()) == (uuid3.getMostSignificantBits() & uuid.getMostSignificantBits())) {
                                    break;
                                }
                            } else if (uuid2.equals(uuid3)) {
                                break;
                            }
                            i5++;
                        }
                    } else {
                        continue;
                    }
                }
                ParcelUuid parcelUuid3 = bleFilter.d;
                if ((parcelUuid3 == null || BleFilter.a(bleFilter.e, bleFilter.f, (byte[]) a2.b.get(parcelUuid3))) && ((i = bleFilter.g) < 0 || BleFilter.a(bleFilter.h, bleFilter.i, a2.a(i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.c, false);
        ivx.c(parcel, 2, this.d, false);
        ivx.a(parcel, 3, this.e);
        ivx.c(parcel, 4, this.f, false);
        ivx.b(parcel, 5, this.g);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        ivx.b(parcel, a2);
    }
}
