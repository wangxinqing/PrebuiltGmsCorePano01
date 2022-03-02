package defpackage;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: afnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afnn implements amqy {
    private final afnt a;

    public afnn(afnt afnt) {
        this.a = afnt;
    }

    public final Object a(Object obj) {
        int i;
        afnt afnt = this.a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            arrayList.add((afkr) pair.second);
        }
        arrayList.addAll(afnt.b.c());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            afkr afkr = (afkr) arrayList.get(i2);
            aucx aucx = afkr.j;
            int size2 = aucx.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                afkn afkn = (afkn) aucx.get(i3);
                Context context = afnt.a;
                int a2 = afkq.a(afkr.f);
                if (a2 == 0) {
                    a2 = 1;
                }
                afmh afmh = afnt.h;
                aucd o = aflh.g.o();
                String b = afsq.b(afkn);
                afpj afpj = afpj.NEW_FILE_KEY;
                int ordinal = afpk.a(context, afmh).ordinal();
                if (ordinal == 0) {
                    String str = afkn.c;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aflh aflh = (aflh) o.b;
                    str.getClass();
                    int i4 = aflh.a | 1;
                    aflh.a = i4;
                    aflh.b = str;
                    int i5 = afkn.d;
                    int i6 = 2 | i4;
                    aflh.a = i6;
                    aflh.c = i5;
                    b.getClass();
                    int i7 = i6 | 4;
                    aflh.a = i7;
                    aflh.d = b;
                    aflh.e = a2 - 1;
                    aflh.a = i7 | 8;
                } else if (ordinal == 1) {
                    String str2 = afkn.c;
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aflh aflh2 = (aflh) o.b;
                    str2.getClass();
                    int i8 = aflh2.a | 1;
                    aflh2.a = i8;
                    aflh2.b = str2;
                    int i9 = afkn.d;
                    int i10 = i8 | 2;
                    aflh2.a = i10;
                    aflh2.c = i9;
                    b.getClass();
                    int i11 = i10 | 4;
                    aflh2.a = i11;
                    aflh2.d = b;
                    aflh2.e = a2 - 1;
                    aflh2.a = i11 | 8;
                    if ((afkn.a & 32) != 0) {
                        avlu avlu = afkn.g;
                        if (avlu == null) {
                            avlu = avlu.b;
                        }
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aflh aflh3 = (aflh) o.b;
                        avlu.getClass();
                        aflh3.f = avlu;
                        aflh3.a |= 16;
                    }
                } else if (ordinal == 2) {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aflh aflh4 = (aflh) o.b;
                    b.getClass();
                    int i12 = aflh4.a | 4;
                    aflh4.a = i12;
                    aflh4.d = b;
                    aflh4.e = a2 - 1;
                    aflh4.a = i12 | 8;
                }
                hashSet.add((aflh) o.i());
                i3++;
            }
            i2 = i;
        }
        return hashSet;
    }
}
