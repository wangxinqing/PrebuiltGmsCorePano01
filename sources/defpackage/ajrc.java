package defpackage;

import android.content.Intent;
import android.os.WorkSource;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ajrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajrc extends ajrb {
    public static final Field b = a("mUids");
    public static final Field c = a("mNum");
    private static final Field d = a("mNames");
    public final WorkSource a;

    public ajrc() {
        this.a = new WorkSource();
    }

    public static ajrc a(Intent intent, String str) {
        WorkSource workSource = (WorkSource) intent.getParcelableExtra(str);
        if (workSource != null) {
            return new ajrc(workSource);
        }
        return null;
    }

    public final WorkSource a() {
        return this.a;
    }

    public final List b() {
        ArrayList arrayList = null;
        try {
            if (!(d == null || this.a == null)) {
                Object obj = d.get(this.a);
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    int length = strArr.length;
                    ArrayList arrayList2 = new ArrayList(length);
                    int i = 0;
                    while (i < length) {
                        try {
                            String str = strArr[i];
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            i++;
                        } catch (Exception e) {
                        }
                    }
                    arrayList = arrayList2;
                }
            }
        } catch (Exception e2) {
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajrc) {
            WorkSource workSource = ((ajrc) obj).a;
            WorkSource workSource2 = this.a;
            if (workSource2 != null) {
                return workSource != null && !workSource2.diff(workSource);
            }
            if (workSource == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        WorkSource workSource = this.a;
        if (workSource != null) {
            return workSource.hashCode();
        }
        return 0;
    }

    public final String toString() {
        WorkSource workSource = this.a;
        return workSource != null ? workSource.toString() : "";
    }

    public ajrc(WorkSource workSource) {
        this.a = workSource;
    }

    protected static Field a(String str) {
        try {
            Field declaredField = WorkSource.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    public final void a(aizx aizx) {
        if (aizx instanceof ajrc) {
            a((ajrb) (ajrc) aizx);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void a(ajrb ajrb) {
        WorkSource workSource = ((ajrc) ajrb).a;
        WorkSource workSource2 = this.a;
        if (workSource2 != null && workSource != null) {
            try {
                workSource2.add(workSource);
            } catch (IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("can't add worksource");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }
}
