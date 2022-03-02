package defpackage;

import android.util.Log;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.firebase.appindexing.Query;
import com.google.firebase.appindexing.ResultSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: oyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oyd extends oxu {
    private final apmq a;
    private final osf b;
    private final oxc c;
    private final ozc d;
    private final Query[] e;

    public oyd(osf osf, oxc oxc, ozc ozc, apmq apmq, Query[] queryArr) {
        super(osf.n(), oxc, osf.r, oxx.a(osf.b));
        this.b = osf;
        this.c = oxc;
        this.d = ozc;
        this.a = apmq;
        this.e = queryArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        ByteBuffer byteBuffer;
        avqi avqi;
        int i;
        ResultSet[] resultSetArr = new ResultSet[this.e.length];
        int i2 = 0;
        while (true) {
            Query[] queryArr = this.e;
            if (i2 >= queryArr.length) {
                return resultSetArr;
            }
            Query query = queryArr[i2];
            pxp pxp = new pxp(aolo.QUERY, plc.b(5));
            pxp.a();
            HashSet hashSet = new HashSet();
            ozs a2 = this.b.a();
            ozc ozc = this.d;
            String str2 = this.c.a;
            ArrayList arrayList = new ArrayList();
            synchronized (((ozq) a2).a()) {
                for (pao d2 : ((ozq) a2).a(ozc, (String[]) null, true, str2)) {
                    osz d3 = ((ozq) a2).d(d2);
                    if (d3 != null && oxe.a(d3.c)) {
                        arrayList.add(d3);
                    }
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                hashSet.add(((osz) arrayList.get(i3)).c);
            }
            HashSet hashSet2 = new HashSet();
            if (query.a.isEmpty()) {
                hashSet2.addAll(hashSet);
            } else {
                HashSet hashSet3 = new HashSet();
                List list = query.a;
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    String str3 = (String) list.get(i4);
                    int i5 = 3;
                    int[] iArr = {1, 2, 3};
                    int i6 = 0;
                    while (true) {
                        i = i4 + 1;
                        if (i6 >= i5) {
                            break;
                        }
                        List list2 = list;
                        int i7 = size2;
                        String b2 = new oxe(oyb.a(this.b.b).b(str3), this.c.a, iArr[i6]).b();
                        if (hashSet.contains(b2)) {
                            hashSet3.add(b2);
                        }
                        i6++;
                        list = list2;
                        size2 = i7;
                        i5 = 3;
                    }
                    List list3 = list;
                    int i8 = size2;
                    i4 = i;
                }
                hashSet2.addAll(hashSet3);
            }
            String[] strArr = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
            if (strArr.length == 0) {
                if (!query.a.isEmpty()) {
                    String valueOf = String.valueOf(query.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
                    sb.append(" for types ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else {
                    str = "";
                }
                String str4 = this.c.a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 31 + String.valueOf(str4).length());
                sb2.append("No index");
                sb2.append(str);
                sb2.append(" is found for package: ");
                sb2.append(str4);
                throw new oxy(sb2.toString(), aolx.INVALID_QUERY_NO_INDEX);
            }
            QueryCall$Request queryCall$Request = new QueryCall$Request();
            queryCall$Request.a = query.b;
            queryCall$Request.b = this.c.a;
            queryCall$Request.c = strArr;
            queryCall$Request.e = 10;
            dti dti = new dti();
            dti.a(new Section("thing_proto"));
            dti.c();
            dti.a = new STSortSpec(query.c);
            queryCall$Request.f = dti.a();
            osf osf = this.b;
            SearchResults a3 = aalu.a(osf, queryCall$Request, this.d, pxp, osf.r.b());
            if (!a3.a()) {
                amzt amzt = new amzt();
                dua b3 = a3.iterator();
                while (b3.hasNext()) {
                    dtz a4 = b3.next();
                    dty a5 = a4.a("thing_proto");
                    if (a5 != null) {
                        a5.a(a4.a);
                        byteBuffer = ByteBuffer.wrap(a5.d, a5.b, a5.c[a5.a]).asReadOnlyBuffer();
                    } else {
                        byteBuffer = null;
                    }
                    if (byteBuffer == null || !byteBuffer.hasRemaining()) {
                        avqi = null;
                    } else {
                        try {
                            avqi = (avqi) aucj.a((aucj) avqi.f, byteBuffer);
                        } catch (auda e2) {
                            if (apmu.a(6)) {
                                Log.e("FirebaseAppIndex", "Invalid thing_proto section", e2);
                            }
                            avqi = null;
                        }
                    }
                    if (avqi == null) {
                        String a6 = a4.a();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a6).length() + 55);
                        sb3.append("Dropping document ");
                        sb3.append(a6);
                        sb3.append(" from result set: invalid Thing proto");
                        apmu.b(sb3.toString());
                    } else {
                        amzt.c(oyl.a(avqi));
                    }
                }
                resultSetArr[i2] = new ResultSet(amzt.a());
                i2++;
            } else {
                throw new IllegalStateException(a3.a);
            }
        }
        while (true) {
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Status status, Object obj) {
        this.a.a(status, (ResultSet[]) obj);
    }
}
