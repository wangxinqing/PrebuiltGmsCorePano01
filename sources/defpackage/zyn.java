package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.romanesco.service.ContactsLoggerUploadService;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: zyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class zyn implements afuq {
    private final ContactsLoggerUploadService a;
    private final boolean b;

    public zyn(ContactsLoggerUploadService contactsLoggerUploadService, boolean z) {
        this.a = contactsLoggerUploadService;
        this.b = z;
    }

    public final aorr a(afxv afxv) {
        afup afup;
        boolean z;
        avdi avdi;
        ContactsLoggerUploadService contactsLoggerUploadService = this.a;
        boolean z2 = this.b;
        if (z2 && !zul.a) {
            throw new zyp("delta API not supported");
        }
        zuk zuk = new zuk();
        zuk.c = System.currentTimeMillis();
        if (!contactsLoggerUploadService.c.a(zuk)) {
            ContactsLoggerUploadService.a.b("cannot run");
            afup = afup.a();
        } else {
            zuk.e = z2;
            zuk.d = true;
            zui zui = (zui) contactsLoggerUploadService.b.a(zuk);
            Set set = zuk.b;
            if (set.isEmpty()) {
                zui.e.b("no accounts to sync");
                z = false;
            } else {
                if (set.size() > 1) {
                    zui.e.c("multiple accounts; will only sync the first!");
                }
                String str = (String) set.iterator().next();
                Set set2 = zuk.b;
                avdg a2 = zui.a(zuk);
                if (a2 != null) {
                    zui.a(set2, a2);
                    if (!zuk.e) {
                        zui.b(set2, a2);
                    }
                    avdi = (avdi) a2.i();
                } else {
                    avdi = null;
                }
                if (avdi != null) {
                    boolean z3 = zuk.e;
                    zvu zvu = new zvu(zui.a);
                    if (azem.a.a().b() && z3) {
                        ClientContext a3 = zvr.a(zui.a, str);
                        aucd o = aqxm.c.o();
                        aucd a4 = zuy.a(avdi);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aqvf aqvf = (aqvf) a4.i();
                        aqvf.getClass();
                        ((aqxm) o.b).b = aqvf;
                        aucx aucx = avdi.b;
                        int size = aucx.size();
                        for (int i = 0; i < size; i++) {
                            aucd a5 = zuy.a((avdf) aucx.get(i), avdi);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aqxm aqxm = (aqxm) o.b;
                            aqvh aqvh = (aqvh) a5.i();
                            aqvh.getClass();
                            if (!aqxm.a.a()) {
                                aqxm.a = aucj.a(aqxm.a);
                            }
                            aqxm.a.add(aqvh);
                        }
                        aqxm aqxm2 = (aqxm) o.i();
                        zvs zvs = zvu.b;
                        long b2 = azer.b();
                        if (zvs.b == null) {
                            zvs.b = baaj.a(baai.UNARY, "google.internal.people.v2.InternalDeviceContactsService/UpsertDeviceContacts", baoq.a(aqxm.c), baoq.a(aqxn.a));
                        }
                        aqxn aqxn = (aqxn) zvs.a.a(zvs.b, a3, aqxm2, b2, TimeUnit.MILLISECONDS);
                        if (!azdq.a.a().x() || avdi.d.isEmpty()) {
                            z = true;
                        } else {
                            ClientContext a6 = zvr.a(zui.a, str);
                            aucd o2 = aquy.c.o();
                            aucd a7 = zuy.a(avdi);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aqvf aqvf2 = (aqvf) a7.i();
                            aqvf2.getClass();
                            ((aquy) o2.b).b = aqvf2;
                            aucv aucv = avdi.d;
                            int size2 = aucv.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                long longValue = ((Long) aucv.get(i2)).longValue();
                                aucd o3 = aqvg.b.o();
                                if (o3.c) {
                                    o3.c();
                                    o3.c = false;
                                }
                                ((aqvg) o3.b).a = longValue;
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                aquy aquy = (aquy) o2.b;
                                aqvg aqvg = (aqvg) o3.i();
                                aqvg.getClass();
                                if (!aquy.a.a()) {
                                    aquy.a = aucj.a(aquy.a);
                                }
                                aquy.a.add(aqvg);
                            }
                            aquy aquy2 = (aquy) o2.i();
                            zvs zvs2 = zvu.b;
                            long b3 = azer.b();
                            if (zvs.c == null) {
                                zvs.c = baaj.a(baai.UNARY, "google.internal.people.v2.InternalDeviceContactsService/DeleteDeviceContacts", baoq.a(aquy.c), baoq.a(aquz.a));
                            }
                            aquz aquz = (aquz) zvs2.a.a(zvs.c, a6, aquy2, b3, TimeUnit.MILLISECONDS);
                            z = true;
                        }
                    } else if (!azem.a.a().a()) {
                        z = true;
                    } else if (!z3) {
                        ClientContext a8 = zvr.a(zui.a, str);
                        aucd o4 = aqul.c.o();
                        aucd a9 = zuy.a(avdi);
                        if (o4.c) {
                            o4.c();
                            o4.c = false;
                        }
                        aqvf aqvf3 = (aqvf) a9.i();
                        aqvf3.getClass();
                        ((aqul) o4.b).b = aqvf3;
                        aucx aucx2 = avdi.b;
                        int size3 = aucx2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            aucd a10 = zuy.a((avdf) aucx2.get(i3), avdi);
                            if (o4.c) {
                                o4.c();
                                o4.c = false;
                            }
                            aqul aqul = (aqul) o4.b;
                            aqvh aqvh2 = (aqvh) a10.i();
                            aqvh2.getClass();
                            if (!aqul.a.a()) {
                                aqul.a = aucj.a(aqul.a);
                            }
                            aqul.a.add(aqvh2);
                        }
                        aqul aqul2 = (aqul) o4.i();
                        zvs zvs3 = zvu.b;
                        long b4 = azer.b();
                        if (zvs.d == null) {
                            zvs.d = baaj.a(baai.UNARY, "google.internal.people.v2.InternalDeviceContactsService/BatchUploadDeviceContacts", baoq.a(aqul.c), baoq.a(aqum.a));
                        }
                        aqum aqum = (aqum) zvs3.a.a(zvs.d, a8, aqul2, b4, TimeUnit.MILLISECONDS);
                        z = true;
                    } else {
                        z = true;
                    }
                } else {
                    zui.e.b("Nothing to upload!");
                    z = false;
                }
            }
            afuo b5 = afup.b((Object) null);
            b5.c = z;
            afup = b5.a();
        }
        return aorl.a((Object) afup);
    }
}
