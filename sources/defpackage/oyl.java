package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: oyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyl {
    private static Bundle a(List list) {
        Bundle bundle = new Bundle();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            avqg avqg = (avqg) list.get(i);
            String str = avqg.b;
            if (!avqg.c.isEmpty()) {
                bundle.putBooleanArray(str, aony.a(avqg.c));
            } else if (!avqg.h.isEmpty()) {
                bundle.putDoubleArray(str, aooc.a((Collection) avqg.h));
            } else if (!avqg.d.isEmpty()) {
                bundle.putLongArray(str, aook.a((Collection) avqg.d));
            } else if (!avqg.e.isEmpty()) {
                bundle.putStringArray(str, (String[]) avqg.e.toArray(new String[0]));
            } else if (avqg.g.a() > 0) {
                bundle.putByteArray(str, avqg.g.k());
            } else if (!avqg.f.isEmpty()) {
                Thing[] thingArr = new Thing[avqg.f.size()];
                for (int i2 = 0; i2 < avqg.f.size(); i2++) {
                    thingArr[i2] = a((avqi) avqg.f.get(i2));
                }
                bundle.putParcelableArray(str, thingArr);
            } else {
                oso.b("%s  unknown type!", (Object) "ThingSerializer");
            }
        }
        return bundle;
    }

    public static avqi b(Thing thing) {
        avqe avqe;
        avqh avqh = (avqh) avqi.f.o();
        String str = thing.d;
        if (str != null) {
            if (avqh.c) {
                avqh.c();
                avqh.c = false;
            }
            avqi avqi = (avqi) avqh.b;
            str.getClass();
            avqi.a |= 2;
            avqi.c = str;
        }
        String str2 = thing.e;
        if (str2 != null) {
            if (avqh.c) {
                avqh.c();
                avqh.c = false;
            }
            avqi avqi2 = (avqi) avqh.b;
            str2.getClass();
            avqi2.a |= 1;
            avqi2.b = str2;
        }
        avqh.a((Iterable) a(thing.b));
        Thing.Metadata metadata = thing.c;
        aucd o = avqe.f.o();
        if (metadata != null) {
            boolean z = metadata.a;
            if (z != ((avqe) o.b).b) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avqe avqe2 = (avqe) o.b;
                avqe2.a |= 1;
                avqe2.b = z;
            }
            int i = metadata.b;
            if (i != ((avqe) o.b).c) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avqe avqe3 = (avqe) o.b;
                avqe3.a |= 2;
                avqe3.c = i;
            }
            if (!amrk.a(metadata.c)) {
                String str3 = metadata.c;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avqe avqe4 = (avqe) o.b;
                str3.getClass();
                avqe4.a |= 4;
                avqe4.d = str3;
            }
            Bundle bundle = metadata.d;
            if (bundle != null) {
                List a = a(bundle);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avqe avqe5 = (avqe) o.b;
                if (!avqe5.e.a()) {
                    avqe5.e = aucj.a(avqe5.e);
                }
                auab.a((Iterable) a, (List) avqe5.e);
            }
            avqe = (avqe) o.i();
        } else {
            avqe = (avqe) o.i();
        }
        if (avqh.c) {
            avqh.c();
            avqh.c = false;
        }
        avqi avqi3 = (avqi) avqh.b;
        avqe.getClass();
        avqi3.e = avqe;
        avqi3.a |= 4;
        return (avqi) avqh.i();
    }

    public static Thing a(avqi avqi) {
        Thing.Metadata metadata;
        Bundle a = a((List) avqi.d);
        avqe avqe = avqi.e;
        if (avqe == null) {
            avqe = avqe.f;
        }
        if (avqe != null) {
            metadata = new Thing.Metadata(avqe.b, avqe.c, avqe.d, a((List) avqe.e));
        } else {
            metadata = new aplt().a();
        }
        return new Thing(a, metadata, avqi.c, avqi.b);
    }

    private static List a(Bundle bundle) {
        List list;
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            avqf avqf = (avqf) avqg.i.o();
            if (avqf.c) {
                avqf.c();
                avqf.c = false;
            }
            avqg avqg = (avqg) avqf.b;
            str.getClass();
            avqg.a |= 1;
            avqg.b = str;
            Object obj = bundle.get(str);
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length;
                if (length == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new aonx(zArr, 0, length);
                }
                if (avqf.c) {
                    avqf.c();
                    avqf.c = false;
                }
                avqg avqg2 = (avqg) avqf.b;
                avqg2.c();
                auab.a((Iterable) list, (List) avqg2.c);
            } else if (obj instanceof double[]) {
                List a = aooc.a((double[]) obj);
                if (avqf.c) {
                    avqf.c();
                    avqf.c = false;
                }
                avqg avqg3 = (avqg) avqf.b;
                avqg3.g();
                auab.a((Iterable) a, (List) avqg3.h);
            } else if (obj instanceof long[]) {
                List a2 = aook.a((long[]) obj);
                if (avqf.c) {
                    avqf.c();
                    avqf.c = false;
                }
                avqg avqg4 = (avqg) avqf.b;
                avqg4.e();
                auab.a((Iterable) a2, (List) avqg4.d);
            } else if (obj instanceof String[]) {
                List asList = Arrays.asList((String[]) obj);
                if (avqf.c) {
                    avqf.c();
                    avqf.c = false;
                }
                avqg avqg5 = (avqg) avqf.b;
                avqg5.f();
                auab.a((Iterable) asList, (List) avqg5.e);
            } else if (obj instanceof byte[]) {
                auay a3 = auay.a((byte[]) obj);
                if (avqf.c) {
                    avqf.c();
                    avqf.c = false;
                }
                avqg avqg6 = (avqg) avqf.b;
                a3.getClass();
                avqg6.a |= 2;
                avqg6.g = a3;
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (Parcelable parcelable : parcelableArr) {
                    avqf.a(b((Thing) parcelable));
                }
            } else if (obj != null) {
                String valueOf = String.valueOf(obj.getClass().getSimpleName());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported type: ") : "Unsupported type: ".concat(valueOf));
            }
            arrayList.add((avqg) avqf.i());
        }
        return arrayList;
    }

    public static byte[] a(Thing thing) {
        return b(thing).k();
    }
}
