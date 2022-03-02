package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;
import java.util.Map;

/* renamed from: oyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oyg {
    public static void a(ozc ozc, osf osf, Map map) {
        if (((Boolean) pba.at.c()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            for (List list : map.values()) {
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        Thing thing = (Thing) list.get(i2);
                        String[] a = thing.c.a("sliceUri");
                        if (a != null && a.length > 0) {
                            if (((Boolean) pba.av.c()).booleanValue()) {
                                Parcel obtain = Parcel.obtain();
                                apnc.a(thing, obtain, 0);
                                obtain.setDataPosition(0);
                                thing = (Thing) Thing.CREATOR.createFromParcel(obtain);
                                list.set(i2, thing);
                            }
                            Uri parse = Uri.parse(a[0]);
                            if (anw.a(osf.b).a(parse, Process.myPid(), Process.myUid()) == 0) {
                                oyj oyj = new oyj(aonk.RETRIEVE_SLICE, ozc.f, osf.b, parse, osf.s);
                                osf.c.d(oyj);
                                oyi oyi = (oyi) oyj.h();
                                if (oyi.b == null) {
                                    byte[] byteArray = oyi.a.toByteArray();
                                    if (((Boolean) pba.ar.c()).booleanValue()) {
                                        int length = byteArray.length;
                                        if (((long) length) > ((Long) ozx.f17co.c()).longValue()) {
                                            String valueOf = String.valueOf(ozx.f17co.c());
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97);
                                            sb.append("Slice error. Slice is ");
                                            sb.append(length);
                                            sb.append(" bytes, which is larger than the maximum allowed size of ");
                                            sb.append(valueOf);
                                            sb.append(" bytes.");
                                            throw new oyf(sb.toString(), parse, aolx.SLICE_TOO_LARGE);
                                        }
                                    }
                                    thing.b.putByteArray("serializedSliceBytes", byteArray);
                                    oso.d("Added serialized Slice of size %d bytes to Indexable uri %s", Integer.valueOf(byteArray.length), thing.d);
                                } else {
                                    oso.a("Failed to retrieve Slice for sliceUri %s", (Object) a[0]);
                                    throw oyi.b;
                                }
                            } else {
                                oso.a("Permission not granted to retrieve Slice uri: %s", (Object) parse);
                                return;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
