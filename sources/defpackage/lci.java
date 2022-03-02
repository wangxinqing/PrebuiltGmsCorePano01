package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* renamed from: lci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lci extends lbs {
    public static final lci c = new lci();

    private lci() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId", "mimeType"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }

    /* access modifiers changed from: protected */
    public final boolean b(DataHolder dataHolder, int i, int i2) {
        for (String a : this.b) {
            if (!dataHolder.a(a)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.f.getLong("dbInstanceId");
        boolean equals = "application/vnd.google-apps.folder".equals(dataHolder.c(lce.N.a, i, i2));
        String c2 = dataHolder.c("resourceId", i, i2);
        return new DriveId("generated-android-null".equals(c2) ? null : c2, Long.valueOf(dataHolder.a("sqlId", i, i2)).longValue(), j, equals ? 1 : 0);
    }
}
