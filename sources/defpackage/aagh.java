package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import java.util.HashSet;
import java.util.TreeSet;

/* renamed from: aagh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aagh extends aafb {
    private final osf a;

    public aagh(osf osf, GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ozc ozc) {
        super(aonk.GET_APP_INDEXING_PACKAGES, 1, 4, osf.b, getAppIndexingPackagesCall$Request, ozc);
        this.a = osf;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        osf osf = this.a;
        Context context = osf.b;
        ozs a2 = osf.a();
        TreeSet treeSet = new TreeSet();
        anhk i = a2.c().listIterator();
        while (i.hasNext()) {
            osz osz = (osz) i.next();
            if (ozq.e(osz)) {
                treeSet.add(osz.e);
            }
        }
        oxx a3 = oxx.a(context);
        HashSet hashSet = new HashSet();
        if (a3.a()) {
            Cursor rawQuery = a3.a.getReadableDatabase().rawQuery("SELECT DISTINCT package FROM [errors]UNION SELECT DISTINCT package FROM [user_actions]", (String[]) null);
            try {
                int columnIndex = rawQuery.getColumnIndex("package");
                while (rawQuery.moveToNext()) {
                    hashSet.add(rawQuery.getString(columnIndex));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        treeSet.addAll(hashSet);
        return new GetAppIndexingPackagesCall$Response(Status.a, (String[]) treeSet.toArray(new String[treeSet.size()]), (String[]) owa.a(context).toArray(new String[0]));
        throw th;
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        return new GetAppIndexingPackagesCall$Response(status, (String[]) null, (String[]) null);
    }
}
