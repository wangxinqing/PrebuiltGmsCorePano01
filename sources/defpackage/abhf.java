package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.people.identity.models.Person;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: abhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abhf implements ablg {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public SmartProfilePerson c;
    private final List d = new ArrayList();
    private final abgf e;
    private avhz f;

    public abhf(abgf abgf, Bundle bundle) {
        this.e = abgf;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("merged emails");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("merged phones");
            if (stringArrayList != null) {
                this.a.addAll(stringArrayList);
            }
            if (stringArrayList2 != null) {
                this.b.addAll(stringArrayList2);
            }
        }
    }

    private final amzy b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SmartProfilePerson smartProfilePerson = this.c;
        if (smartProfilePerson != null) {
            ArrayList arrayList = new ArrayList();
            List list = smartProfilePerson.i;
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.Emails emails = (Person.Emails) list.get(i);
                    if (!hashSet.contains(emails.i())) {
                        arrayList.add(emails);
                        hashSet.add(emails.i());
                    }
                }
                Collections.sort(arrayList, new abgz());
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.Emails emails2 = (Person.Emails) arrayList.get(i2);
                if (!linkedHashMap.containsKey(emails2.i())) {
                    aucd o = avhx.e.o();
                    String i3 = emails2.i();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avhx avhx = (avhx) o.b;
                    i3.getClass();
                    avhx.a |= 2;
                    avhx.b = i3;
                    String a2 = this.e.a(emails2.e(), abgd.a);
                    if (!TextUtils.isEmpty(a2)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avhx avhx2 = (avhx) o.b;
                        a2.getClass();
                        avhx2.a |= 8;
                        avhx2.c = a2;
                    }
                    linkedHashMap.put(emails2.i(), (avhx) o.i());
                }
            }
        }
        avhz avhz = this.f;
        if (avhz != null) {
            aucx aucx = avhz.a;
            int size3 = aucx.size();
            for (int i4 = 0; i4 < size3; i4++) {
                avhx avhx3 = (avhx) aucx.get(i4);
                if (!avhx3.b.isEmpty()) {
                    if (linkedHashMap.containsKey(avhx3.b)) {
                        avhx avhx4 = (avhx) linkedHashMap.get(avhx3.b);
                        aucd o2 = avhx.e.o();
                        String str = avhx4.b;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avhx avhx5 = (avhx) o2.b;
                        str.getClass();
                        int i5 = avhx5.a | 2;
                        avhx5.a = i5;
                        avhx5.b = str;
                        if ((avhx4.a & 8) != 0) {
                            String str2 = avhx4.c;
                            str2.getClass();
                            avhx5.a = i5 | 8;
                            avhx5.c = str2;
                        }
                        if ((avhx3.a & 16) != 0) {
                            int a3 = avhw.a(avhx3.d);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            avhx avhx6 = (avhx) o2.b;
                            avhx6.d = a3 - 1;
                            avhx6.a |= 16;
                        }
                        linkedHashMap.put(avhx3.b, (avhx) o2.i());
                    } else {
                        linkedHashMap.put(avhx3.b, avhx3);
                    }
                }
            }
        }
        List list2 = this.a;
        if (list2 != null) {
            int size4 = list2.size();
            for (int i6 = 0; i6 < size4; i6++) {
                String str3 = (String) list2.get(i6);
                if (!linkedHashMap.containsKey(str3)) {
                    aucd o3 = avhx.e.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    avhx avhx7 = (avhx) o3.b;
                    str3.getClass();
                    avhx7.a |= 2;
                    avhx7.b = str3;
                    linkedHashMap.put(str3, (avhx) o3.i());
                }
            }
        }
        return amzy.a(linkedHashMap.values());
    }

    private final amzy c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SmartProfilePerson smartProfilePerson = this.c;
        if (smartProfilePerson != null) {
            ArrayList arrayList = new ArrayList();
            List list = smartProfilePerson.y;
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list.get(i);
                    if (!hashSet.contains(phoneNumbers.k())) {
                        arrayList.add(phoneNumbers);
                        hashSet.add(phoneNumbers.k());
                    }
                }
                Collections.sort(arrayList, new abha());
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.PhoneNumbers phoneNumbers2 = (Person.PhoneNumbers) arrayList.get(i2);
                if (!linkedHashMap.containsKey(phoneNumbers2.k())) {
                    aucd o = avhy.e.o();
                    String k = phoneNumbers2.k();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    avhy avhy = (avhy) o.b;
                    k.getClass();
                    int i3 = avhy.a | 2;
                    avhy.a = i3;
                    avhy.b = k;
                    avhy.d = 2;
                    avhy.a = i3 | 32;
                    String a2 = this.e.a(phoneNumbers2.g(), abgc.a);
                    if (!TextUtils.isEmpty(a2)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        avhy avhy2 = (avhy) o.b;
                        a2.getClass();
                        avhy2.a |= 8;
                        avhy2.c = a2;
                    }
                    linkedHashMap.put(phoneNumbers2.k(), (avhy) o.i());
                }
            }
        }
        avhz avhz = this.f;
        if (avhz != null) {
            aucx aucx = avhz.b;
            int size3 = aucx.size();
            for (int i4 = 0; i4 < size3; i4++) {
                avhy avhy3 = (avhy) aucx.get(i4);
                if (!avhy3.b.isEmpty()) {
                    if (!linkedHashMap.containsKey(avhy3.b) || (avhy3.a & 32) == 0) {
                        linkedHashMap.put(avhy3.b, avhy3);
                    } else {
                        String str = avhy3.b;
                        aucd a3 = avhy.e.a((aucj) (avhy) linkedHashMap.get(str));
                        int a4 = avhw.a(avhy3.d);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        if (a3.c) {
                            a3.c();
                            a3.c = false;
                        }
                        avhy avhy4 = (avhy) a3.b;
                        avhy4.d = a4 - 1;
                        avhy4.a |= 32;
                        linkedHashMap.put(str, (avhy) a3.i());
                    }
                }
            }
        }
        List list2 = this.b;
        if (list2 != null) {
            int size4 = list2.size();
            for (int i5 = 0; i5 < size4; i5++) {
                String str2 = (String) list2.get(i5);
                if (!linkedHashMap.containsKey(str2)) {
                    aucd o2 = avhy.e.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    avhy avhy5 = (avhy) o2.b;
                    str2.getClass();
                    avhy5.a |= 2;
                    avhy5.b = str2;
                    linkedHashMap.put(str2, (avhy) o2.i());
                }
            }
        }
        return amzy.a(linkedHashMap.values());
    }

    private final amzy d() {
        avhz avhz = this.f;
        if (avhz == null || avhz.c.size() == 0) {
            return amzy.h();
        }
        amzt j = amzy.j();
        if (!this.f.d.isEmpty()) {
            aucd o = avhu.e.o();
            String str = this.f.d;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avhu avhu = (avhu) o.b;
            str.getClass();
            avhu.a |= 2;
            avhu.b = str;
            j.c((avhu) o.i());
        }
        j.b((Iterable) this.f.c);
        return j.a();
    }

    public final void a() {
        amzy b2 = b();
        amzy c2 = c();
        amzy d2 = d();
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((abhe) list.get(i)).a(b2, c2, d2);
        }
    }

    public final void a(abgl abgl) {
        avhz avhz = abgl.b;
        if (avhz != null) {
            this.f = avhz;
            a();
        }
    }

    public final void a(abhe abhe) {
        this.d.add(abhe);
        amzy b2 = b();
        amzy c2 = c();
        amzy d2 = d();
        if (!b2.isEmpty() || !c2.isEmpty() || !d2.isEmpty()) {
            abhe.a(b2, c2, d2);
        }
    }
}
