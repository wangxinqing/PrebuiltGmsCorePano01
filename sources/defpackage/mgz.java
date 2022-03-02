package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: mgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mgz implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ SendInvitationsChimeraActivity c;

    public mgz(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, String str, String str2) {
        this.c = sendInvitationsChimeraActivity;
        this.a = str;
        this.b = str2;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.c;
        mfp mfp = sendInvitationsChimeraActivity.g;
        adwq adwq = new adwq();
        adwq.b();
        adxa a2 = adws.a(sendInvitationsChimeraActivity, adwq.a());
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity2 = this.c;
        return new mgu(sendInvitationsChimeraActivity, mfp, a2, sendInvitationsChimeraActivity2.a, sendInvitationsChimeraActivity2.f, this.a, sendInvitationsChimeraActivity2.c, this.b, sendInvitationsChimeraActivity2.i, sendInvitationsChimeraActivity2.e);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        mhg mhg = (mhg) obj;
        if (!mhg.b) {
            this.c.h();
            return;
        }
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.c;
        ArrayList arrayList = (ArrayList) mhg.a;
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Contact contact = (Contact) arrayList.get(i2);
            int i3 = contact.j;
            if (i3 == 7 || i3 == 8) {
                hashSet2.add(Integer.valueOf(contact.d));
            } else if (contact.b()) {
                hashMap.put(Integer.valueOf(contact.d), contact);
            } else {
                hashSet.add(Integer.valueOf(contact.d));
            }
        }
        ArrayList arrayList5 = sendInvitationsChimeraActivity.c;
        int size2 = arrayList5.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Contact contact2 = (Contact) arrayList5.get(i4);
            Integer valueOf = Integer.valueOf(contact2.d);
            if (hashSet2.contains(valueOf)) {
                arrayList4.add(contact2);
            } else if (hashSet.contains(valueOf)) {
                arrayList2.add(contact2);
            } else if (hashMap.containsKey(valueOf)) {
                Contact contact3 = (Contact) hashMap.get(valueOf);
                contact2.f = contact3.f;
                contact2.e = contact3.e;
                arrayList3.add(contact2);
            } else {
                String valueOf2 = String.valueOf(contact2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                sb.append("contact with no status after invitation: ");
                sb.append(valueOf2);
                mfv.f("SendInvChimeraActivity", sb.toString(), new Object[0]);
            }
        }
        int size3 = arrayList2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            sendInvitationsChimeraActivity.a((Contact) arrayList2.get(i5));
        }
        int size4 = arrayList3.size();
        int i6 = 0;
        while (i6 < size4) {
            Contact contact4 = (Contact) arrayList3.get(i6);
            int i7 = contact4.j;
            if (i7 == 3) {
                i = 9;
            } else if (i7 != 4) {
                int i8 = contact4.d;
                String valueOf3 = String.valueOf(contact4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                sb2.append("Updated details for contactId: ");
                sb2.append(i8);
                sb2.append(" To:");
                sb2.append(valueOf3);
                sb2.toString();
                i6++;
                ith ith = mfv.a;
            } else {
                i = 10;
            }
            contact4.j = i;
            int i82 = contact4.d;
            String valueOf32 = String.valueOf(contact4);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 46);
            sb22.append("Updated details for contactId: ");
            sb22.append(i82);
            sb22.append(" To:");
            sb22.append(valueOf32);
            sb22.toString();
            i6++;
            ith ith2 = mfv.a;
        }
        sendInvitationsChimeraActivity.a((List) arrayList4);
        sendInvitationsChimeraActivity.i();
        if (sendInvitationsChimeraActivity.d == null) {
            throw new IllegalArgumentException("Device doesn't support SMS.");
        } else if (arrayList3.isEmpty()) {
            mfv.b("SendInvChimeraActivity", "No sms invitation need to be sent", new Object[0]);
        } else {
            sendInvitationsChimeraActivity.d.a(arrayList3, sendInvitationsChimeraActivity.b);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
