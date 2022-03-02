package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsResultReceiver;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: mgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgu extends mhh {
    private final List b;
    private final ResultReceiver c;
    private final String d;
    private final adxa e;
    private final WalletCustomTheme f;
    private final mfr g;
    private final String h;
    private final apix i;
    private final mfp j;

    public mgu(Context context, mfp mfp, adxa adxa, WalletCustomTheme walletCustomTheme, mfr mfr, String str, List list, String str2, apix apix, ResultReceiver resultReceiver) {
        super(context);
        this.b = list;
        this.d = str;
        this.h = str2;
        this.c = resultReceiver;
        this.e = adxa;
        this.f = walletCustomTheme;
        this.g = mfr;
        this.i = apix;
        this.j = mfp;
    }

    /* access modifiers changed from: package-private */
    public final ArrayList a(List list, String str, String str2) {
        String str3 = str;
        acwa a = this.e.a(new GetClientTokenRequest(this.f));
        try {
            byte[] bArr = (byte[]) acws.a(a, 2, TimeUnit.SECONDS);
            aucd o = aphv.e.o();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = list.size();
            boolean z = false;
            int i2 = 0;
            while (i2 < size) {
                Contact contact = (Contact) list.get(i2);
                int i3 = contact.j;
                if (i3 == 3 || i3 == 4) {
                    aucd o2 = apjv.l.o();
                    aucd o3 = apjx.d.o();
                    apix apix = this.i;
                    if (o2.c) {
                        o2.c();
                        o2.c = z;
                    }
                    apjv apjv = (apjv) o2.b;
                    apjv.e = apix.g;
                    int i4 = 8 | apjv.a;
                    apjv.a = i4;
                    apjv.i = 1;
                    apjv.a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    contact.c();
                    int c2 = contact.c();
                    if (o2.c) {
                        o2.c();
                        o2.c = z;
                    }
                    apjv apjv2 = (apjv) o2.b;
                    apjv2.j = c2 - 1;
                    apjv2.a |= 512;
                    if (str3 != null) {
                        apjv apjv3 = (apjv) o2.b;
                        str.getClass();
                        apjv3.a |= 64;
                        apjv3.g = str3;
                    }
                    aucd o4 = apit.g.o();
                    String str4 = contact.b;
                    if (str4 != null) {
                        if (o4.c) {
                            o4.c();
                            o4.c = z;
                        }
                        apit apit = (apit) o4.b;
                        str4.getClass();
                        apit.a |= 1;
                        apit.b = str4;
                    }
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    apjv apjv4 = (apjv) o2.b;
                    apit apit2 = (apit) o4.i();
                    apit2.getClass();
                    apjv4.d = apit2;
                    apjv4.a |= 4;
                    String str5 = contact.a;
                    if (str5 == null) {
                        String str6 = contact.c;
                        if (str6 != null) {
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            apjx apjx = (apjx) o3.b;
                            str6.getClass();
                            apjx.a |= 1;
                            apjx.b = str6;
                        }
                    } else {
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        apjx apjx2 = (apjx) o3.b;
                        str5.getClass();
                        apjx2.a |= 2;
                        apjx2.c = str5;
                    }
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    apjv apjv5 = (apjv) o2.b;
                    apjx apjx3 = (apjx) o3.i();
                    apjx3.getClass();
                    apjv5.c = apjx3;
                    apjv5.a |= 2;
                    if (str3 != null) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        apjv apjv6 = (apjv) o2.b;
                        str.getClass();
                        apjv6.a |= 64;
                        apjv6.g = str3;
                    }
                    String num = Integer.toString(contact.d);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    apjv apjv7 = (apjv) o2.b;
                    num.getClass();
                    apjv7.a |= 1024;
                    apjv7.k = num;
                    hashMap.put(apjv7.k, contact);
                    arrayList.add((apjv) o2.i());
                }
                i2++;
                z = false;
            }
            apgv a2 = mgg.a(getContext(), this.g, this.j);
            if (o.c) {
                o.c();
                o.c = z;
            }
            aphv aphv = (aphv) o.b;
            a2.getClass();
            aphv.b = a2;
            aphv.a |= 1;
            auay a3 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = z;
            }
            aphv aphv2 = (aphv) o.b;
            a3.getClass();
            aphv2.a |= 2;
            aphv2.d = a3;
            if (!aphv2.c.a()) {
                aphv2.c = aucj.a(aphv2.c);
            }
            auab.a((Iterable) arrayList, (List) aphv2.c);
            String valueOf = String.valueOf(o);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Create Invitations Request:");
            sb.append(valueOf);
            sb.toString();
            ith ith = mfv.a;
            try {
                mhp a4 = mgk.a();
                ClientContext a5 = mgk.a(str2);
                aphv aphv3 = (aphv) o.i();
                if (mhp.k == null) {
                    mhp.k = baaj.a(baai.UNARY, "google.familymanagement.v1.FamilyManagementService/CreateInvitations", baoq.a(aphv.e), baoq.a(aphw.d));
                }
                aphw aphw = (aphw) a4.a.a(mhp.k, a5, aphv3, (long) mhp.b, TimeUnit.MILLISECONDS);
                mfr mfr = this.g;
                apgw apgw = aphw.a;
                if (apgw == null) {
                    apgw = apgw.c;
                }
                mgg.a(mfr, apgw);
                String valueOf2 = String.valueOf(aphw);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Create Invitations Response:");
                sb2.append(valueOf2);
                sb2.toString();
                ArrayList arrayList2 = new ArrayList();
                aucx aucx = aphw.b;
                int size2 = aucx.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    apjv apjv8 = (apjv) aucx.get(i5);
                    Contact contact2 = (Contact) hashMap.get(apjv8.k);
                    Contact contact3 = new Contact(contact2);
                    contact3.f = apjv8.b;
                    if (contact2.b()) {
                        contact3.e = apjv8.h;
                    }
                    String valueOf3 = String.valueOf(contact3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb3.append("Contact updated:");
                    sb3.append(valueOf3);
                    sb3.toString();
                    arrayList2.add(contact3);
                }
                aucx aucx2 = aphw.c;
                int size3 = aucx2.size();
                for (int i6 = z; i6 < size3; i6++) {
                    Contact contact4 = (Contact) hashMap.get(((apil) aucx2.get(i6)).a);
                    Contact contact5 = new Contact(contact4);
                    int i7 = contact4.j;
                    if (i7 == 3) {
                        contact5.j = 7;
                    } else if (i7 == 4) {
                        contact5.j = 8;
                    }
                    arrayList2.add(contact5);
                }
                return arrayList2;
            } catch (babk | eif e2) {
                throw new mgf(e2.getMessage(), e2);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            ith ith2 = mfv.a;
            throw new mgt(a.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList arrayList = new ArrayList();
        try {
            return new mhg(true, a(this.b, this.d, this.h));
        } catch (mgf | mgt e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Error creatingInvitations: ");
            } else {
                "Error creatingInvitations: ".concat(valueOf);
            }
            ith ith = mfv.a;
            Bundle bundle = new Bundle();
            int i2 = SendInvitationsResultReceiver.a;
            bundle.putInt("result-code", 2);
            ResultReceiver resultReceiver = this.c;
            if (resultReceiver != null) {
                resultReceiver.send(-1, bundle);
            }
            return new mhg(false, arrayList);
        }
    }
}
