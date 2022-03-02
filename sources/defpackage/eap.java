package defpackage;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: eap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eap {
    private static String[] a;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.appinvite.model.ContactPerson a(defpackage.xfj r11, java.lang.String[] r12) {
        /*
            java.lang.String r0 = r11.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0016
            com.google.android.gms.people.model.AvatarReference r0 = new com.google.android.gms.people.model.AvatarReference
            java.lang.String r3 = r11.d()
            r0.<init>(r2, r3)
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            java.lang.String r3 = r11.b()
            java.lang.String[] r12 = a((java.lang.String[]) r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0026:
            int r7 = r12.length
            if (r6 >= r7) goto L_0x00c0
            r7 = r12[r6]
            if (r7 != 0) goto L_0x002f
        L_0x002d:
            goto L_0x00bc
        L_0x002f:
            int r8 = r7.hashCode()
            r9 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
            r10 = 2
            if (r8 == r9) goto L_0x0058
            r9 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r8 == r9) goto L_0x004e
            r9 = 106642798(0x65b3d6e, float:4.1234453E-35)
            if (r8 == r9) goto L_0x0044
            goto L_0x0062
        L_0x0044:
            java.lang.String r8 = "phone"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0062
            r7 = 2
            goto L_0x0063
        L_0x004e:
            java.lang.String r8 = "email"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0062
            r7 = 1
            goto L_0x0063
        L_0x0058:
            java.lang.String r8 = "google"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0062
            r7 = 0
            goto L_0x0063
        L_0x0062:
            r7 = -1
        L_0x0063:
            if (r7 == 0) goto L_0x00ae
            if (r7 == r2) goto L_0x008b
            if (r7 == r10) goto L_0x006a
            goto L_0x002d
        L_0x006a:
            java.lang.Iterable r7 = r11.g()     // Catch:{ Exception -> 0x00ac }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00ac }
        L_0x0072:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x00ac }
            if (r8 == 0) goto L_0x00bc
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x00ac }
            xfl r8 = (defpackage.xfl) r8     // Catch:{ Exception -> 0x00ac }
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r9 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod     // Catch:{ Exception -> 0x00ac }
            java.lang.String r8 = r8.a()     // Catch:{ Exception -> 0x00ac }
            r9.<init>(r10, r8, r0)     // Catch:{ Exception -> 0x00ac }
            a((java.util.List) r4, (com.google.android.gms.appinvite.model.ContactPerson.ContactMethod) r9)     // Catch:{ Exception -> 0x00ac }
            goto L_0x0072
        L_0x008b:
            java.lang.Iterable r7 = r11.f()     // Catch:{ Exception -> 0x00ac }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00ac }
        L_0x0093:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x00ac }
            if (r8 == 0) goto L_0x00bc
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x00ac }
            xfg r8 = (defpackage.xfg) r8     // Catch:{ Exception -> 0x00ac }
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r9 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod     // Catch:{ Exception -> 0x00ac }
            java.lang.String r8 = r8.a()     // Catch:{ Exception -> 0x00ac }
            r9.<init>(r2, r8, r0)     // Catch:{ Exception -> 0x00ac }
            a((java.util.List) r4, (com.google.android.gms.appinvite.model.ContactPerson.ContactMethod) r9)     // Catch:{ Exception -> 0x00ac }
            goto L_0x0093
        L_0x00ac:
            r7 = move-exception
            goto L_0x00bc
        L_0x00ae:
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L_0x00bc
            com.google.android.gms.appinvite.model.ContactPerson$ContactMethod r7 = new com.google.android.gms.appinvite.model.ContactPerson$ContactMethod
            r7.<init>(r5, r3, r0)
            a((java.util.List) r4, (com.google.android.gms.appinvite.model.ContactPerson.ContactMethod) r7)
        L_0x00bc:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x00c0:
            int r12 = r4.size()
            if (r12 <= 0) goto L_0x00d0
            com.google.android.gms.appinvite.model.ContactPerson r12 = new com.google.android.gms.appinvite.model.ContactPerson
            java.lang.String r11 = r11.c()
            r12.<init>(r11, r3, r0, r4)
            return r12
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eap.a(xfj, java.lang.String[]):com.google.android.gms.appinvite.model.ContactPerson");
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    public static void b(ContactPerson contactPerson, ContactPerson contactPerson2) {
        if (contactPerson != contactPerson2) {
            contactPerson.a = contactPerson2.a;
            contactPerson.b = contactPerson2.b;
            contactPerson.c = contactPerson2.c;
            contactPerson.d = contactPerson2.d;
            contactPerson.e.clear();
            contactPerson.e.addAll(contactPerson2.e);
            contactPerson.a(contactPerson2.a());
        }
    }

    private static boolean b(Object obj, Object obj2) {
        return (obj == null) != (obj2 == null);
    }

    public static boolean c(ContactPerson contactPerson, ContactPerson contactPerson2) {
        ArrayList arrayList = contactPerson.e;
        ArrayList arrayList2 = contactPerson2.e;
        if (arrayList.size() == 0 || arrayList2.size() == 0) {
            return false;
        }
        boolean containsAll = arrayList.containsAll(arrayList2);
        boolean containsAll2 = arrayList2.containsAll(arrayList);
        if (!containsAll || !containsAll2) {
            if (!containsAll) {
                if (!containsAll2) {
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    ArrayList arrayList4 = new ArrayList(arrayList2);
                    arrayList3.removeAll(arrayList2);
                    arrayList4.removeAll(arrayList);
                    if (!a((List) arrayList3) || !a((List) arrayList4)) {
                        return false;
                    }
                    return true;
                }
                b(contactPerson, contactPerson2);
            }
            return true;
        }
        if (!b((Object) contactPerson.d, (Object) contactPerson2.d)) {
            if (!b((Object) contactPerson.b, (Object) contactPerson2.b)) {
                if (b((Object) contactPerson.c, (Object) contactPerson2.c) && contactPerson.c == null) {
                    b(contactPerson, contactPerson2);
                }
            } else if (contactPerson.b == null) {
                b(contactPerson, contactPerson2);
            }
        } else if (contactPerson.d == null) {
            b(contactPerson, contactPerson2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r4 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(com.google.android.gms.appinvite.model.ContactPerson r4, com.google.android.gms.appinvite.model.ContactPerson r5) {
        /*
            boolean r0 = defpackage.ius.a(r4, r5)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r4.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r4.b
            java.lang.String r3 = r5.b
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0029
        L_0x001a:
            java.lang.Long r4 = r4.c
            if (r4 == 0) goto L_0x0028
            java.lang.Long r5 = r5.c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            return r1
        L_0x0028:
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eap.d(com.google.android.gms.appinvite.model.ContactPerson, com.google.android.gms.appinvite.model.ContactPerson):boolean");
    }

    public static String a(Context context, ContactPerson contactPerson) {
        String a2 = a(contactPerson);
        return TextUtils.isEmpty(a2) ? context.getString(R.string.appinvite_contextual_selection_person_no_name_display_name) : a2;
    }

    public static String a(ContactPerson contactPerson) {
        if (!TextUtils.isEmpty(contactPerson.a)) {
            return contactPerson.a;
        }
        ContactPerson.ContactMethod a2 = contactPerson.a();
        if (a2 == null) {
            return "";
        }
        int i = a2.a;
        return (i == 1 || i == 2) ? a2.b : "";
    }

    public static void a(ContactPerson contactPerson, ContactPerson contactPerson2) {
        contactPerson.a = (String) a((Object) contactPerson.a, (Object) contactPerson2.a);
        contactPerson.b = (String) a((Object) contactPerson.b, (Object) contactPerson2.b);
        contactPerson.c = (Long) a((Object) contactPerson.c, (Object) contactPerson2.c);
        contactPerson.d = (AvatarReference) a((Object) contactPerson.d, (Object) contactPerson2.d);
        ArrayList arrayList = new ArrayList(contactPerson2.e);
        arrayList.removeAll(contactPerson.e);
        contactPerson.e.addAll(arrayList);
    }

    private static void a(List list, ContactPerson.ContactMethod contactMethod) {
        if (!list.contains(contactMethod)) {
            list.add(contactMethod);
        }
    }

    public static void a(List list, List list2, List list3, List list4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((ContactPerson) it.next(), list2, list3, list4)) {
                it.remove();
            }
        }
    }

    public static boolean a(ContactPerson contactPerson, List list, List list2, List list3) {
        String str;
        if (contactPerson == null || (list == null && list2 == null && list3 == null)) {
            return false;
        }
        if (list != null && (str = contactPerson.b) != null && list.contains(str)) {
            return true;
        }
        ArrayList arrayList = contactPerson.e;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList.get(i);
                String str2 = contactMethod.b;
                if (str2 != null) {
                    int i2 = contactMethod.a;
                    if (i2 != 1) {
                        if (i2 == 2 && list3 != null && list3.contains(PhoneNumberUtils.stripSeparators(str2))) {
                            return true;
                        }
                    } else if (list2 != null && list2.contains(str2.toLowerCase())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((ContactPerson.ContactMethod) list.get(i)).a != 0) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        if (r2.length <= 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String[] a(java.lang.String[] r2) {
        /*
            java.lang.Class<eap> r0 = defpackage.eap.class
            monitor-enter(r0)
            if (r2 == 0) goto L_0x000b
            int r1 = r2.length     // Catch:{ all -> 0x0024 }
            if (r1 > 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            monitor-exit(r0)
            return r2
        L_0x000b:
            java.lang.String[] r2 = a     // Catch:{ all -> 0x0024 }
            if (r2 != 0) goto L_0x0021
            awhr r2 = defpackage.awhr.a     // Catch:{ all -> 0x0024 }
            awhv r2 = r2.a()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = r2.i()     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = ";"
            java.lang.String[] r2 = r2.split(r1)     // Catch:{ all -> 0x0024 }
            a = r2     // Catch:{ all -> 0x0024 }
        L_0x0021:
            java.lang.String[] r2 = a     // Catch:{ all -> 0x0024 }
            goto L_0x0009
        L_0x0024:
            r2 = move-exception
            monitor-exit(r0)
            goto L_0x0028
        L_0x0027:
            throw r2
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eap.a(java.lang.String[]):java.lang.String[]");
    }
}
