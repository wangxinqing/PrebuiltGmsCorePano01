package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new zvw();
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersion deviceVersion, boolean z) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        DeviceVersionEntity deviceVersionEntity = null;
        if (z) {
            this.h = list;
            if (list != null) {
                this.g = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.g.add((SourceStatsEntity) ((SourceStats) it.next()));
                }
            } else {
                this.g = null;
            }
            this.f = (DeviceVersionEntity) deviceVersion;
            return;
        }
        this.h = list;
        if (list != null) {
            this.g = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SourceStats sourceStats = (SourceStats) it2.next();
                this.g.add(new SourceStatsEntity(sourceStats.a(), sourceStats.b()));
            }
        } else {
            this.g = null;
        }
        this.f = deviceVersion != null ? new DeviceVersionEntity(deviceVersion.a()) : deviceVersionEntity;
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public final List c() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            List list2 = this.g;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.h.add((SourceStats) list2.get(i));
            }
        }
        return this.h;
    }

    public final String d() {
        return this.c;
    }

    public final Long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return ius.a(a(), backedUpContactsPerDevice.a()) && ius.a(b(), backedUpContactsPerDevice.b()) && ius.a(c(), backedUpContactsPerDevice.c()) && ius.a(d(), backedUpContactsPerDevice.d()) && ius.a(e(), backedUpContactsPerDevice.e()) && ius.a(f(), backedUpContactsPerDevice.f()) && ius.a(g(), backedUpContactsPerDevice.g());
    }

    public final Long f() {
        return this.e;
    }

    public final DeviceVersion g() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f(), g()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.c(parcel, 3, c(), false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.b);
        ivx.a(parcel, 8, this.f, i, false);
        ivx.b(parcel, a2);
    }

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }
}
