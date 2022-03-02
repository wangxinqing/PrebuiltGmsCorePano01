package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
import com.google.android.gms.drive.metadata.internal.PartialDriveId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: lbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbv extends lbr implements kys {
    public static final lbl c = new lbu();

    public lbv() {
        super("parents", Collections.emptySet(), Arrays.asList(new String[]{"parentsExtra", "dbInstanceId", "parentsExtraHolder"}), 4100000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return b(bundle);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    public final Collection d(DataHolder dataHolder, int i, int i2) {
        String str;
        DataHolder dataHolder2 = dataHolder;
        Bundle bundle = dataHolder2.f;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
        if (parcelableArrayList == null) {
            if (bundle.getParcelable("parentsExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder dataHolder3 = (DataHolder) dataHolder2.f.getParcelable("parentsExtraHolder");
                    if (dataHolder3 != null) {
                        try {
                            int i3 = dataHolder2.h;
                            ArrayList arrayList = new ArrayList(i3);
                            HashMap hashMap = new HashMap(i3);
                            for (int i4 = 0; i4 < i3; i4++) {
                                int a = dataHolder2.a(i4);
                                ParentDriveIdSet parentDriveIdSet = new ParentDriveIdSet(new ArrayList());
                                arrayList.add(parentDriveIdSet);
                                hashMap.put(Long.valueOf(dataHolder2.a("sqlId", i4, a)), parentDriveIdSet);
                            }
                            Bundle bundle2 = dataHolder3.f;
                            String string = bundle2.getString("childSqlIdColumn");
                            String string2 = bundle2.getString("parentSqlIdColumn");
                            String string3 = bundle2.getString("parentResIdColumn");
                            int i5 = dataHolder3.h;
                            int i6 = 0;
                            while (i6 < i5) {
                                int a2 = dataHolder3.a(i6);
                                ((ParentDriveIdSet) hashMap.get(Long.valueOf(dataHolder3.a(string, i6, a2)))).a.add(new PartialDriveId(dataHolder3.c(string3, i6, a2), dataHolder3.a(string2, i6, a2), 1));
                                i6++;
                                string3 = string3;
                            }
                            dataHolder2.f.putParcelableArrayList("parentsExtra", arrayList);
                        } finally {
                            dataHolder3.close();
                            str = "parentsExtraHolder";
                            dataHolder2.f.remove(str);
                        }
                    }
                }
                parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
            }
            if (parcelableArrayList == null) {
                return null;
            }
        }
        long j = bundle.getLong("dbInstanceId");
        HashSet hashSet = new HashSet();
        List list = ((ParentDriveIdSet) parcelableArrayList.get(i)).a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            PartialDriveId partialDriveId = (PartialDriveId) list.get(i7);
            hashSet.add(new DriveId(partialDriveId.a, partialDriveId.b, j, partialDriveId.c));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Collection c(Bundle bundle) {
        Collection c2 = super.b(bundle);
        if (c2 != null) {
            return new HashSet(c2);
        }
        return null;
    }
}
