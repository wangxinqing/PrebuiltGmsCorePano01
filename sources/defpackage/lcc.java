package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: lcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcc extends lbr {
    public lcc() {
        super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), 7000000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    public final Collection d(DataHolder dataHolder, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (dataHolder.d("inDriveSpace", i, i2)) {
            arrayList.add(DriveSpace.a);
        }
        if (dataHolder.d("isAppData", i, i2)) {
            arrayList.add(DriveSpace.b);
        }
        if (dataHolder.d("inGooglePhotosSpace", i, i2)) {
            arrayList.add(DriveSpace.c);
        }
        return arrayList;
    }
}
