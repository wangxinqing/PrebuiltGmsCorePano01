package defpackage;

import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: vai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vai implements Comparable {
    public final String a;
    public final String b;
    public final Map c;
    public final Map d;
    public final LinkedHashMap e;
    final long f;
    public double g = Double.NaN;
    public auzf h;
    public byte[] i;

    public vai(long j, String str) {
        this.f = j;
        this.b = str;
        this.a = UUID.randomUUID().toString();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new LinkedHashMap(1);
    }

    public static final int a(Object obj, BleSignalImpl bleSignalImpl, Map map, int i2) {
        if (!map.containsKey(obj)) {
            map.put(obj, bleSignalImpl);
            return i2 | 16;
        }
        BleSignalImpl bleSignalImpl2 = (BleSignalImpl) map.get(obj);
        tga tga = vak.a;
        if (bleSignalImpl2 != null && bleSignalImpl != null && bleSignalImpl2.c == bleSignalImpl.c && ((long) Math.abs(bleSignalImpl2.b - bleSignalImpl.b)) < aync.a.a().Q()) {
            return 0;
        }
        map.put(obj, bleSignalImpl);
        return 16;
    }

    public final Set b() {
        return Collections.unmodifiableSet(this.c.keySet());
    }

    public final Set c() {
        return Collections.unmodifiableSet(this.d.keySet());
    }

    public final Set d() {
        return Collections.unmodifiableSet(this.e.keySet());
    }

    public final Map e() {
        return Collections.unmodifiableMap(this.c);
    }

    public final Map f() {
        return Collections.unmodifiableMap(this.d);
    }

    public final Map g() {
        return Collections.unmodifiableMap(this.e);
    }

    public final uzx h() {
        return (uzx) ance.b(this.e.keySet().iterator(), (Object) null);
    }

    public final auzf i() {
        if (this.h == null) {
            UUID fromString = UUID.fromString(this.a);
            this.h = uzu.a(3, ByteBuffer.wrap(new byte[16]).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array());
        }
        return this.h;
    }

    public final String toString() {
        String str;
        String str2;
        Object[] objArr = new Object[7];
        objArr[0] = this.a;
        Map map = this.c;
        if (!map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (Map.Entry entry : map.entrySet()) {
                sb.append(uzu.a((auzf) entry.getKey()));
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append("}");
            str = sb.toString();
        } else {
            str = "{}";
        }
        objArr[1] = str;
        objArr[2] = this.d;
        objArr[3] = this.e;
        objArr[4] = Long.valueOf(this.f);
        objArr[5] = Double.valueOf(this.g);
        byte[] bArr = this.i;
        if (bArr != null) {
            str2 = jjp.d(bArr);
        } else {
            str2 = null;
        }
        objArr[6] = str2;
        return String.format("Device{handle=%s, beaconIdToBleSignal=%s, urlToBleSignal=%s, bleRecordToBleSignal=%s, foundMillis=%s, distanceEstimate=%s, telemetry=%s}", objArr);
    }

    public vai(vai vai) {
        this.a = vai.a;
        this.b = vai.b;
        this.f = vai.f;
        this.c = new HashMap(vai.c);
        this.d = new HashMap(vai.d);
        this.e = new LinkedHashMap(vai.e);
        this.g = vai.g;
        this.i = vai.i;
    }

    /* renamed from: a */
    public final int compareTo(vai vai) {
        return Double.compare(this.g, vai.g);
    }

    public final BleSignalImpl a(auzf auzf) {
        return (BleSignalImpl) this.c.get(auzf);
    }

    public final BleSignalImpl a(Object obj) {
        if (obj instanceof auzf) {
            return a((auzf) obj);
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        return null;
    }

    public final BleSignalImpl a(String str) {
        return (BleSignalImpl) this.d.get(str);
    }

    public final boolean a() {
        return !Double.isNaN(this.g);
    }
}
