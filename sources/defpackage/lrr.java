package defpackage;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: lrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrr {
    public static kqy a() {
        String a = kmk.a.a.a();
        String a2 = koh.REQUIRED_ENTRY_ID.h.a();
        String b = koi.a.b();
        String a3 = koh.REQUIRED_ENTRY_ID.h.a();
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + String.valueOf(b).length() + String.valueOf(a3).length());
        sb.append(a);
        sb.append(" NOT IN (SELECT ");
        sb.append(a2);
        sb.append(" FROM ");
        sb.append(b);
        sb.append(" WHERE ");
        sb.append(a3);
        sb.append(" IS NOT NULL)");
        return kqz.a(sb.toString());
    }

    public static kqy b(long j) {
        return kmj.ACCOUNT_ID.c.e(j);
    }

    public static kqy a(long j) {
        kqy e = kny.CHILD_ENTRY_ID.c.e(j);
        return kqz.a(String.format(Locale.US, "%s IN (SELECT %s FROM %s WHERE %s)", new Object[]{kne.ENTRY_ID.aB.a(), kny.PARENT_ENTRY_ID.c.a(), knz.a.b(), e.a}), (List) e.b);
    }

    public static kqy a(long j, long j2) {
        return kqz.a(b(j), kmk.a.a.e(j2));
    }

    public static kqy a(long j, AppIdentity appIdentity) {
        return kqz.a(axds.b() ? kmf.ACCOUNT_ID.h.e(j) : b(j), klh.PACKAGE_NAME.j.b(appIdentity.b), klh.CERTIFICATE_HASH.j.b(appIdentity.c));
    }

    public static kqy a(long j, String str) {
        iva.a((Object) str);
        return kqz.a(b(j), kmj.RESOURCE_ID.c.b(str));
    }

    public static kqy a(long j, String str, String str2, boolean z) {
        return kqz.a(b(j), !z ? kne.APPDATA_OWNER_SDK_APP_ID.aB.e() : kne.APPDATA_OWNER_SDK_APP_ID.aB.d(), kne.UNIQUE_IDENTIFIER.aB.b(str), kne.SINGLETON_CREATOR_SDK_APP_ID.aB.b(str2));
    }

    public static kqy a(long j, knc knc, int i) {
        kqy[] kqyArr = new kqy[3];
        kqyArr[0] = kpm.ANDROID_APP_ID.i.e(j);
        kqyArr[1] = kpm.EVENT_TYPE.i.e((long) i);
        kqyArr[2] = knc != null ? kpm.ENTRY_ID.i.e(knc.a) : kpm.ENTRY_ID.i.e();
        return kqz.a(kqyArr);
    }

    private static kqy a(DriveSpace driveSpace) {
        if (DriveSpace.a.equals(driveSpace)) {
            return kne.IN_DRIVE_SPACE.aB.f();
        }
        if (DriveSpace.b.equals(driveSpace)) {
            return kne.APPDATA_OWNER_SDK_APP_ID.aB.d();
        }
        if (DriveSpace.c.equals(driveSpace)) {
            return kne.IN_PHOTOS_SPACE.aB.f();
        }
        String valueOf = String.valueOf(driveSpace);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unrecognized space: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static kqy a(String str, Iterable iterable) {
        return kqz.a(String.format(Locale.US, "%s IN (\"%s\")", new Object[]{str, TextUtils.join("\",\"", iterable)}));
    }

    public static kqy a(List list, String str, boolean z) {
        kqy kqy;
        if (list.size() == 1) {
            kqy = kly.ENTRY_ID.h.e(((Long) list.get(0)).longValue());
        } else {
            kqy = a(kly.ENTRY_ID.h.a(), (Iterable) list);
        }
        if (!z) {
            kqy = kqz.a(kqy, kly.VALUE.h.d());
        }
        if (str == null) {
            return kqy;
        }
        return kqz.a(kqy, kqz.b(kly.SDK_APP_ID.h.b(str), kly.SDK_APP_ID.h.e()));
    }

    public static kqy a(Set set) {
        iva.a((Object) set, (Object) "Spaces must not be null");
        iva.b(!set.isEmpty(), "Set of spaces must be non-empty");
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(a((DriveSpace) it.next()));
        }
        return kqz.b((List) arrayList);
    }

    public static kqy a(khq khq) {
        if (khq.a()) {
            return kqz.a;
        }
        Set set = khq.e;
        ArrayList arrayList = new ArrayList();
        if (khq.c()) {
            arrayList.add(a(DriveSpace.a));
        }
        if (khq.d()) {
            arrayList.add(kqz.a(a(DriveSpace.a), kms.SDK_APP_ID.c.b(khq.b)));
        }
        if (set.contains(jzl.APPDATA)) {
            arrayList.add(kne.APPDATA_OWNER_SDK_APP_ID.aB.b(khq.b));
        }
        if (khq.b()) {
            arrayList.add(a(DriveSpace.c));
        }
        return kqz.b((List) arrayList);
    }

    public static kqy a(kqh kqh, long j, long j2) {
        return kqz.a(kqh.d(), kqz.b(kqh.a(j), kqh.d(j2)));
    }

    public static kqy a(boolean z, DriveId driveId) {
        kqy kqy;
        String str;
        if (driveId.a == null) {
            kqy = kmk.a.a.e(driveId.b);
        } else {
            kqy = kmj.RESOURCE_ID.c.b(driveId.a);
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = kne.ENTRY_ID.aB.a();
        if (!z) {
            str = "";
        } else {
            str = "NOT";
        }
        objArr[1] = str;
        objArr[2] = kny.CHILD_ENTRY_ID.c.a();
        objArr[3] = "ParentDriveIdView";
        objArr[4] = kqy.a;
        return kqz.a(String.format(locale, "%s %s IN (SELECT %s FROM %s WHERE %s)", objArr), (List) kqy.b);
    }

    public static kqy a(boolean z, CustomPropertyKey customPropertyKey, khq khq, String str) {
        String str2;
        if (str == null) {
            return kqz.b;
        }
        kqy a = kqz.a(kly.NAME.h.b(customPropertyKey.a), kly.VALUE.h.b(str));
        if (customPropertyKey.b == 1 && !khq.a()) {
            a = kqz.a(a, kly.SDK_APP_ID.h.b(khq.b));
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = kne.ENTRY_ID.aB.a();
        if (!z) {
            str2 = "";
        } else {
            str2 = "NOT";
        }
        objArr[1] = str2;
        objArr[2] = kly.ENTRY_ID.h.a();
        objArr[3] = klz.a.b();
        objArr[4] = a.a;
        return kqz.a(String.format(locale, "%s %s IN (SELECT %s FROM %s WHERE %s)", objArr), (List) a.b);
    }
}
