package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aagl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aagl extends aafb {
    private final osf a;

    public aagl(osf osf, GetStorageStatsCall$Request getStorageStatsCall$Request, ozc ozc) {
        super(aonk.GET_STORAGE_STATS, 1, 4, osf.b, getStorageStatsCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        SparseArray sparseArray;
        long j;
        boolean z;
        SparseArray sparseArray2;
        int i;
        ove h = this.a.n.h();
        ozs a2 = this.a.a();
        synchronized (((ozq) a2).a()) {
            sparseArray = new SparseArray(((ozq) a2).f.size());
            anhk i2 = ((ozq) a2).c().listIterator();
            while (i2.hasNext()) {
                osz osz = (osz) i2.next();
                sparseArray.put(osz.b, osz.e);
            }
        }
        long a3 = NativeIndex.a(this.a.i.a);
        File[] listFiles = new File(this.a.b.getApplicationInfo().dataDir).listFiles();
        int length = listFiles.length;
        int i3 = 0;
        long j2 = 0;
        while (i3 < length) {
            SparseArray sparseArray3 = sparseArray;
            long j3 = j2;
            File file = listFiles[i3];
            j2 = (file.getName().equals("cache") || file.getName().equals("lib")) ? j3 : NativeIndex.a(file) + j3;
            i3++;
            sparseArray = sparseArray3;
        }
        HashMap hashMap = new HashMap();
        aucx aucx = h.a;
        int size = aucx.size();
        int i4 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (i4 < size) {
            ovd ovd = (ovd) aucx.get(i4);
            long j7 = ovd.d;
            long j8 = j2;
            long j9 = ovd.e;
            j4 += j7;
            j5 += j9;
            aucx aucx2 = aucx;
            String str = (String) sparseArray.get(ovd.a);
            if (str != null) {
                Pair pair = (Pair) hashMap.get(str);
                if (pair == null) {
                    pair = Pair.create(0L, 0L);
                }
                i = size;
                hashMap.put(str, Pair.create(Long.valueOf(((Long) pair.first).longValue() + j7), Long.valueOf(((Long) pair.second).longValue() + j9)));
                sparseArray2 = sparseArray;
            } else {
                i = size;
                sparseArray2 = sparseArray;
                j6 += j9;
                if (j7 != 0) {
                    oso.b("Corpus %d from an unknown package using %d bytes.", (Object) Integer.valueOf(ovd.a), (Object) Long.valueOf(j7));
                }
            }
            i4++;
            aucx = aucx2;
            j2 = j8;
            size = i;
            sparseArray = sparseArray2;
        }
        long j10 = j2;
        long j11 = j6;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            Pair pair2 = (Pair) entry.getValue();
            if (j4 != 0) {
                j = ((a3 - j5) * ((Long) pair2.first).longValue()) / j4;
            } else {
                j = 0;
            }
            GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = new GetStorageStatsCall$PackageStats();
            getStorageStatsCall$PackageStats.a = (String) entry.getKey();
            getStorageStatsCall$PackageStats.b = j;
            oyz d = this.a.m.d((String) entry.getKey());
            if (d != null) {
                z = d.c();
            } else {
                z = false;
            }
            getStorageStatsCall$PackageStats.c = z;
            getStorageStatsCall$PackageStats.d = ((Long) pair2.second).longValue();
            arrayList.add(getStorageStatsCall$PackageStats);
        }
        GetStorageStatsCall$Response getStorageStatsCall$Response = new GetStorageStatsCall$Response();
        getStorageStatsCall$Response.a = Status.a;
        getStorageStatsCall$Response.b = (GetStorageStatsCall$PackageStats[]) arrayList.toArray(new GetStorageStatsCall$PackageStats[arrayList.size()]);
        getStorageStatsCall$Response.c = j11;
        getStorageStatsCall$Response.d = a3;
        getStorageStatsCall$Response.e = j10;
        return getStorageStatsCall$Response;
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetStorageStatsCall$Response getStorageStatsCall$Response = new GetStorageStatsCall$Response();
        getStorageStatsCall$Response.a = status;
        return getStorageStatsCall$Response;
    }
}
