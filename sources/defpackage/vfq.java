package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: vfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfq extends arwm {
    final /* synthetic */ PrintWriter a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ NearbyMessagesChimeraService c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfq(NearbyMessagesChimeraService nearbyMessagesChimeraService, String str, PrintWriter printWriter, CountDownLatch countDownLatch) {
        super(str);
        this.c = nearbyMessagesChimeraService;
        this.a = printWriter;
        this.b = countDownLatch;
    }

    public final void run() {
        int i;
        char c2;
        String str;
        byte[] bArr;
        Iterator it;
        vbp vbp;
        String str2;
        String str3;
        String str4;
        int i2;
        ves ves = (ves) this.c.h.a(ves.class);
        PrintWriter printWriter = this.a;
        ves.c.b();
        vee vee = new vee(ves.a, (String) null, 9729);
        String str5 = "";
        String valueOf = String.valueOf(vee.a(str5));
        printWriter.println(valueOf.length() == 0 ? new String("Server URL: ") : "Server URL: ".concat(valueOf));
        this.a.println();
        uyt uyt = (uyt) this.c.h.a(uyt.class);
        PrintWriter printWriter2 = this.a;
        uyt.g.b();
        Set m = uyt.d.m();
        int size = m.size();
        StringBuilder sb = new StringBuilder(26);
        sb.append(size);
        sb.append(" subscriber(s):");
        printWriter2.println(sb.toString());
        Iterator it2 = m.iterator();
        while (true) {
            i = 1;
            c2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            ClientAppIdentifier clientAppIdentifier = (ClientAppIdentifier) it2.next();
            Set<uyq> a2 = ((amxb) uyt.d).c((Object) clientAppIdentifier);
            if (a2 != null) {
                i2 = a2.size();
            } else {
                i2 = 0;
            }
            printWriter2.printf("  [%s] %d subscription(s):\n", new Object[]{clientAppIdentifier, Integer.valueOf(i2)});
            printWriter2.print("    ");
            if (a2 != null) {
                for (uyq println : a2) {
                    printWriter2.println(println);
                }
            }
        }
        this.a.println();
        uyj uyj = (uyj) this.c.h.a(uyj.class);
        PrintWriter printWriter3 = this.a;
        uyj.d.b();
        int size2 = uyj.c.size();
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append(size2);
        sb2.append(" publisher(s):");
        printWriter3.println(sb2.toString());
        for (uyg println2 : uyj.c) {
            printWriter3.print("  ");
            printWriter3.println(println2);
        }
        this.a.println();
        PrintWriter printWriter4 = this.a;
        uxu uxu = ((vbf) this.c.h.a(vbf.class)).c;
        printWriter4.println("Started mediums:");
        SparseArray sparseArray = uxu.b;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            arrayList.add((vgq) sparseArray.valueAt(i3));
        }
        String valueOf2 = String.valueOf(arrayList);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
        sb3.append("  Advertising: ");
        sb3.append(valueOf2);
        printWriter4.println(sb3.toString());
        String valueOf3 = String.valueOf(vgu.a((Iterable) uxu.a(uxu.c)));
        printWriter4.println(valueOf3.length() == 0 ? new String("  Foreground scanning: ") : "  Foreground scanning: ".concat(valueOf3));
        uxu.e.b();
        if (uxu.h != null) {
            str = "[ble]";
        } else {
            str = "[]";
        }
        printWriter4.println(str.length() == 0 ? new String("  Background scanning: ") : "  Background scanning: ".concat(str));
        this.a.println();
        uwl uwl = this.c.j;
        PrintWriter printWriter5 = this.a;
        printWriter5.println("BackgroundSubscribeCache (SystemMemoryCache)");
        String valueOf4 = String.valueOf(uwl.a.b());
        printWriter5.println(valueOf4.length() == 0 ? new String("  id=") : "  id=".concat(valueOf4));
        printWriter5.println("  cacheData=");
        for (Bundle bundle : uwl.b()) {
            String valueOf5 = String.valueOf(uwl.e(bundle));
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf5).length() + 11);
            sb4.append("    client=");
            sb4.append(valueOf5);
            printWriter5.print(sb4.toString());
            long d = uwl.d(bundle);
            StringBuilder sb5 = new StringBuilder(43);
            sb5.append(", expirationTimeMillis=");
            sb5.append(d);
            printWriter5.print(sb5.toString());
            String valueOf6 = String.valueOf(uwl.b(bundle));
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 10);
            sb6.append(", request=");
            sb6.append(valueOf6);
            printWriter5.println(sb6.toString());
        }
        this.a.println();
        vbp vbp2 = (vbp) this.c.h.a(vbp.class);
        PrintWriter printWriter6 = this.a;
        Iterator it3 = vbp2.d.a().iterator();
        while (it3.hasNext()) {
            ClientAppIdentifier clientAppIdentifier2 = (ClientAppIdentifier) it3.next();
            Object[] objArr = new Object[i];
            objArr[c2] = clientAppIdentifier2;
            printWriter6.printf("Client %s - ", objArr);
            Collection<avae> a3 = vbp2.d.a(clientAppIdentifier2).a();
            int size3 = a3.size();
            StringBuilder sb7 = new StringBuilder(38);
            sb7.append(size3);
            sb7.append(" nearby online message(s): ");
            printWriter6.println(sb7.toString());
            for (avae avae : a3) {
                auzr auzr = avae.c;
                if (auzr == null) {
                    auzr = auzr.e;
                }
                int a4 = auzr.c.a();
                if (a4 > 50) {
                    bArr = Arrays.copyOf(auzr.c.k(), 50);
                } else {
                    bArr = auzr.c.k();
                }
                auzu auzu = auzr.b;
                if (auzu == null) {
                    auzu = auzu.d;
                }
                String str6 = auzu.b;
                auzu auzu2 = auzr.b;
                if (auzu2 == null) {
                    auzu2 = auzu.d;
                }
                String str7 = auzu2.c;
                int a5 = auzr.c.a();
                StringBuilder sb8 = new StringBuilder();
                if (bArr == null) {
                    sb8.append("\"\"");
                    str3 = sb8.toString();
                    str2 = str5;
                    vbp = vbp2;
                    it = it3;
                } else {
                    sb8.append('\"');
                    int length = bArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str8 = str5;
                        byte b2 = bArr[i4] & 255;
                        vbp vbp3 = vbp2;
                        char c3 = (char) b2;
                        Iterator it4 = it3;
                        if (b2 == 92 || b2 == 34) {
                            sb8.append('\\');
                            sb8.append(c3);
                        } else if (b2 >= 32 && b2 < Byte.MAX_VALUE) {
                            sb8.append(c3);
                        } else {
                            sb8.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                        }
                        i4++;
                        str5 = str8;
                        vbp2 = vbp3;
                        it3 = it4;
                    }
                    str2 = str5;
                    vbp = vbp2;
                    it = it3;
                    sb8.append('\"');
                    str3 = sb8.toString();
                }
                if (a4 <= 50) {
                    str4 = str2;
                } else {
                    str4 = " <truncated>";
                }
                StringBuilder sb9 = new StringBuilder(String.valueOf(str6).length() + 54 + String.valueOf(str7).length() + String.valueOf(str3).length() + str4.length());
                sb9.append("Message{namespace=");
                sb9.append(str6);
                sb9.append(", type=");
                sb9.append(str7);
                sb9.append(", payload=");
                sb9.append(a5);
                sb9.append(" bytes ");
                sb9.append(str3);
                sb9.append(str4);
                sb9.append("}");
                String sb10 = sb9.toString();
                String valueOf7 = String.valueOf(avae.b);
                String valueOf8 = String.valueOf(avae.e);
                String a6 = uzu.a((Iterable) avae.d);
                StringBuilder sb11 = new StringBuilder(String.valueOf(sb10).length() + 64 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(a6).length());
                sb11.append("SubscribedMessage{message=");
                sb11.append(sb10);
                sb11.append(", subscriptionIds=");
                sb11.append(valueOf7);
                sb11.append(", urls=");
                sb11.append(valueOf8);
                sb11.append(", beaconIds=");
                sb11.append(a6);
                sb11.append("}");
                String valueOf9 = String.valueOf(sb11.toString());
                printWriter6.println(valueOf9.length() == 0 ? new String("  ") : "  ".concat(valueOf9));
                str5 = str2;
                vbp2 = vbp;
                it3 = it;
            }
            String str9 = str5;
            vbp vbp4 = vbp2;
            Iterator it5 = it3;
            printWriter6.println();
            i = 1;
            c2 = 0;
        }
        this.a.println();
        vak vak = (vak) this.c.h.a(vak.class);
        PrintWriter printWriter7 = this.a;
        Set<String> keySet = vak.g.keySet();
        int size4 = keySet.size();
        StringBuilder sb12 = new StringBuilder(26);
        sb12.append(size4);
        sb12.append(" ble device(s):");
        printWriter7.println(sb12.toString());
        for (String str10 : keySet) {
            printWriter7.printf("  [%s] %s\n", new Object[]{str10, (vai) vak.g.get(str10)});
        }
        this.a.println();
        ved ved = (ved) this.c.h.a(ved.class);
        PrintWriter printWriter8 = this.a;
        ArrayList arrayList2 = new ArrayList();
        anhj a7 = uxu.a.iterator();
        while (a7.hasNext()) {
            avch avch = (avch) a7.next();
            avaa[] avaaArr = (avaa[]) ved.a.get(avch.k);
            if (avaaArr != null) {
                arrayList2.add(String.format("%s %s", new Object[]{Integer.valueOf(avaaArr.length), vgu.a(avch)}));
            }
        }
        printWriter8.printf("Reserved tokens: %s\n", new Object[]{arrayList2});
        this.a.println();
        vgw vgw = (vgw) this.c.h.a(vgw.class);
        PrintWriter printWriter9 = this.a;
        vgw.c.b();
        vgw.a();
        printWriter9.printf("%s nearby token(s):\n", new Object[]{Integer.valueOf(vgw.a.size())});
        HashSet<vgx> hashSet = new HashSet<>();
        HashSet<vgx> hashSet2 = new HashSet<>();
        HashSet<vgx> hashSet3 = new HashSet<>();
        for (vgx vgx : vgw.a.values()) {
            int i5 = vgx.f;
            if (i5 == 1) {
                hashSet3.add(vgx);
            } else if (i5 == 3) {
                hashSet.add(vgx);
            } else if (i5 != 4) {
                ((anih) tgc.a.b()).a("Unknown network state(%s) for token cache item: %s", vgx.f, (Object) vgx);
            } else {
                hashSet2.add(vgx);
            }
        }
        for (vgx vgx2 : hashSet) {
            printWriter9.printf("  [valid] %s\n", new Object[]{vgx2});
        }
        for (vgx vgx3 : hashSet2) {
            printWriter9.printf("  [invalid] %s\n", new Object[]{vgx3});
        }
        for (vgx vgx4 : hashSet3) {
            printWriter9.printf("  [unconfirmed] %s\n", new Object[]{vgx4});
        }
        this.b.countDown();
    }
}
