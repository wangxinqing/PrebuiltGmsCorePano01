package com.google.android.gms.family.invites;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.LoaderManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendInvitationsChimeraActivity extends bjs implements View.OnClickListener, icb, mgw, mfz {
    private static final int[] k = {1, 2, 3, 4};
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D;
    private boolean E;
    private String F;
    private boolean G = false;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private String L = "2";
    private PageData M;
    private PageData N;
    private PageData O;
    private ContactPickerOptionsData P;
    public WalletCustomTheme a;
    public String b;
    public ArrayList c = new ArrayList();
    public mhe d;
    public ResultReceiver e;
    public mfr f;
    public mfp g;
    public mhi h;
    public apix i = apix.UNKNOWN_FAMILY_ROLE;
    private int j;
    private icc l;
    private wli m;
    private LoaderManager n;
    private SmsSentReceiver o;
    private mgx p;
    private final SparseArray q = new SparseArray();
    private boolean r = false;
    private ArrayList s = new ArrayList();
    private ViewGroup t;
    private ViewGroup u;
    private ViewGroup v;
    private ViewGroup w;
    private int x = 0;
    private int y = 0;
    private int z = 0;

    private final List a(Set set) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Contact contact = (Contact) arrayList2.get(i2);
            if (set.contains(Integer.valueOf(contact.j))) {
                arrayList.add(contact);
            }
        }
        return arrayList;
    }

    private final void b(int i2) {
        this.j = i2;
        int[] iArr = k;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            (i4 != 2 ? i4 != 3 ? i4 != 4 ? this.t : this.w : this.v : this.u).setVisibility(i4 == i2 ? 0 : 8);
        }
    }

    private final boolean j() {
        return getIntent().getBooleanExtra("isOnboardInvitations", false);
    }

    private final boolean k() {
        return getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final void l() {
        mfv.c("SendInvChimeraActivity", "RetryView shown", new Object[0]);
        b(3);
        HashMap hashMap = this.N.a;
        if (hashMap != null && hashMap.containsKey(2)) {
            a(this.v, (String) this.N.a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.v.findViewById(R.id.fm_invitations_failed_list);
        recyclerView.setLayoutManager(new abk());
        List a2 = a((Set) new HashSet(Arrays.asList(new Integer[]{7, 13})));
        HashMap hashMap2 = this.N.a;
        if (hashMap2 != null && hashMap2.containsKey(3)) {
            mgh.a((TextView) this.v.findViewById(R.id.fm_invitations_retry_error_title), (String) this.N.a.get(3), new mgb(this.N, this, this.b));
        }
        recyclerView.setAdapter(new mgs(a2, this.l, this.m, true, this));
        Button button = (Button) this.v.findViewById(R.id.fm_invitations_skip_retry_button);
        HashMap hashMap3 = this.N.a;
        if (hashMap3 != null && hashMap3.containsKey(5)) {
            button.setText((CharSequence) this.N.a.get(5));
        }
        button.setOnClickListener(this);
        Button button2 = (Button) this.v.findViewById(R.id.fm_invitations_retry_now_button);
        HashMap hashMap4 = this.N.a;
        if (hashMap4 != null && hashMap4.containsKey(4)) {
            button2.setText((CharSequence) this.N.a.get(4));
        }
        button2.setOnClickListener(this);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        mfv.c("SendInvChimeraActivity", "SendingView shown", new Object[0]);
        b(2);
        HashMap hashMap = this.O.a;
        if (hashMap != null && hashMap.containsKey(2)) {
            a(this.u, (String) this.O.a.get(2));
        }
    }

    public final void f() {
        mfv.c("SendInvChimeraActivity", "Skip Failures View", new Object[0]);
        b(4);
        HashMap hashMap = this.M.a;
        if (hashMap != null && hashMap.containsKey(2)) {
            a(this.w, (String) this.M.a.get(2));
        }
        RecyclerView recyclerView = (RecyclerView) this.w.findViewById(R.id.fm_invitations_failed_list);
        recyclerView.setLayoutManager(new abk());
        List a2 = a((Set) new HashSet(Arrays.asList(new Integer[]{8, 14, 16})));
        HashMap hashMap2 = this.M.a;
        if (hashMap2 != null && hashMap2.containsKey(3)) {
            mgh.a((TextView) this.w.findViewById(R.id.fm_invitations_text_skip_failures_title), (String) this.M.a.get(3), new mgb(this.M, this, this.b));
        }
        recyclerView.setAdapter(new mgs(a2, this.l, this.m, true, this));
        Button button = (Button) this.w.findViewById(R.id.fm_invitations_skip_failures_button);
        TextView textView = (TextView) this.w.findViewById(R.id.fm_invitations_skip_list_header);
        if (!k() || !axga.c()) {
            textView.setText(R.string.fm_invitations_text_invitations);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        HashMap hashMap3 = this.M.a;
        if (hashMap3 != null && hashMap3.containsKey(4)) {
            button.setText((CharSequence) this.M.a.get(4));
        }
        button.setOnClickListener(this);
    }

    public final Activity getActivity() {
        return this;
    }

    public final void h() {
        a((List) this.c);
    }

    public final void i() {
        int i2 = this.x;
        int i3 = this.y;
        StringBuilder sb = new StringBuilder(50);
        sb.append(i2);
        sb.append(" sent successfully, ");
        sb.append(i3);
        sb.append(" failed.");
        sb.toString();
        ith ith = mfv.a;
        HashSet hashSet = new HashSet(Arrays.asList(new Integer[]{1, 3, 4, 9, 10}));
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (!hashSet.contains(Integer.valueOf(((Contact) arrayList.get(i4)).j))) {
                i4 = i5;
            } else {
                return;
            }
        }
        if (this.s.isEmpty()) {
            mfv.c("SendInvChimeraActivity", "All state update done, finishing.", new Object[0]);
            a(-1, this.z);
        } else if (!this.A) {
            mfv.c("SendInvChimeraActivity", "All state update done, showing retry view", new Object[0]);
            l();
        } else {
            mfv.c("SendInvChimeraActivity", "All state update done, showing skip failures view", new Object[0]);
            f();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        int i6 = 0;
        if (i4 != 1) {
            if (i4 == 3) {
                if (!axga.c()) {
                    return;
                }
            } else if (i4 == 2) {
                this.p.a(false);
                return;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Contact picker returned ");
        sb.append(i5);
        mfv.c("SendInvChimeraActivity", sb.toString(), new Object[0]);
        if (i5 == -1) {
            if (axfu.b()) {
                ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("selectedContacts");
                ArrayList arrayList = new ArrayList();
                int size = parcelableArrayListExtra.size();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i7 < size) {
                    ContactPerson contactPerson = (ContactPerson) parcelableArrayListExtra.get(i7);
                    ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) contactPerson.d.get(i6);
                    Contact contact = new Contact();
                    contact.b = contactPerson.a;
                    int i11 = i10 + 1;
                    contact.d = i10;
                    contact.g = contactPerson.c;
                    int i12 = contactMethod.a;
                    if (i12 == 1) {
                        contact.a = contactMethod.b;
                        i8++;
                    } else if (i12 == 0) {
                        contact.c = contactMethod.b;
                        i9++;
                    }
                    contact.j = 1;
                    String valueOf = String.valueOf(contact);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
                    sb2.append("Adding a contact to the list: ");
                    sb2.append(valueOf);
                    sb2.toString();
                    arrayList.add(contact);
                    i7++;
                    i10 = i11;
                    i6 = 0;
                }
                this.H = i8;
                this.I = i9;
                this.c = arrayList;
            } else {
                intent2.setExtrasClassLoader(com.google.android.gms.appinvite.model.ContactPerson.class.getClassLoader());
                ArrayList parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE");
                ArrayList arrayList2 = new ArrayList();
                int size2 = parcelableArrayListExtra2.size();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i13 < size2) {
                    com.google.android.gms.appinvite.model.ContactPerson contactPerson2 = (com.google.android.gms.appinvite.model.ContactPerson) parcelableArrayListExtra2.get(i13);
                    ContactPerson.ContactMethod a2 = contactPerson2.a();
                    Contact contact2 = new Contact();
                    contact2.b = contactPerson2.a;
                    int i17 = i16 + 1;
                    contact2.d = i16;
                    contact2.g = contactPerson2.d;
                    int i18 = a2.a;
                    if (i18 == 2) {
                        contact2.a = a2.b;
                        i14++;
                    } else if (i18 == 1) {
                        contact2.c = a2.b;
                        i15++;
                    }
                    contact2.j = 1;
                    String valueOf2 = String.valueOf(contact2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                    sb3.append("Adding a contact to the list: ");
                    sb3.append(valueOf2);
                    sb3.toString();
                    arrayList2.add(contact2);
                    i13++;
                    i16 = i17;
                }
                this.H = i14;
                this.I = i15;
                this.c = arrayList2;
            }
            if (this.c.isEmpty()) {
                a(-1, 0);
                return;
            }
            e();
            if (i4 == 1) {
                a(this.b, 2000);
            } else {
                this.n.initLoader(2000, (Bundle) null, new mhb(this, this.F, this.c));
            }
        } else if (i5 == 0) {
            mfv.c("SendInvChimeraActivity", "Handling RESULT_CANCELED for people selection", new Object[0]);
            a(0, 0);
        }
    }

    public final void onBackPressed() {
        int i2 = this.j;
        if (i2 == 1) {
            super.onBackPressed();
        } else if (i2 != 2) {
            a(0, this.z);
        } else {
            mfv.c("SendInvChimeraActivity", "Suppressing back button", new Object[0]);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.fm_invitations_skip_retry_button) {
            a(-1, this.z);
        } else if (view.getId() == R.id.fm_invitations_skip_failures_button) {
            a(-1, this.z);
        } else if (view.getId() == R.id.fm_invitations_retry_now_button) {
            mfv.c("SendInvChimeraActivity", "Retry now clicked, starting flow again", new Object[0]);
            this.s.clear();
            this.q.clear();
            if (this.r) {
                a(this.b, 3000);
            } else {
                String str = this.b;
                this.x = 0;
                this.y = 0;
                HashSet hashSet = new HashSet(Collections.singletonList(13));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Contact contact = (Contact) arrayList2.get(i2);
                    if (hashSet.contains(Integer.valueOf(contact.j)) && contact.b()) {
                        arrayList.add(contact);
                        contact.j = 10;
                    }
                }
                this.d.a(arrayList, str);
            }
            this.A = true;
            mfv.c("SendInvChimeraActivity", "ResendingView shown", new Object[0]);
            b(2);
            HashMap hashMap = this.O.a;
            if (hashMap != null && hashMap.containsKey(2)) {
                a(this.u, (String) this.O.a.get(2));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("clientCallingPackage");
        if (stringExtra != null) {
            mfx.a(this, getIntent(), stringExtra);
            this.L = Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion);
        }
        this.n = getSupportLoaderManager();
        setContentView((int) R.layout.fm_invitations_base);
        this.f = new mfr();
        if (getIntent().getStringExtra("consistencyToken") != null) {
            this.f.a(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0));
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fm_invitations_startup_page);
        this.t = viewGroup;
        a(viewGroup, getString(R.string.fm_invitations_invite_family_title));
        this.u = (ViewGroup) findViewById(R.id.fm_invitations_sending);
        this.v = (ViewGroup) findViewById(R.id.fm_invitations_retry_error);
        this.w = (ViewGroup) findViewById(R.id.fm_invitations_skip_failures);
        this.e = new SendInvitationsResultReceiver(new qvr(Looper.getMainLooper()), new WeakReference(this));
        this.b = getIntent().getStringExtra("accountName");
        this.F = getIntent().getStringExtra("appId");
        this.i = apix.a(getIntent().getIntExtra("inviteeRole", 3));
        this.g = new mfp(this.F, this.L);
        this.O = (PageData) getIntent().getParcelableExtra("invitesSendingPagedata");
        this.N = (PageData) getIntent().getParcelableExtra("invitesRetryPagedata");
        this.M = (PageData) getIntent().getParcelableExtra("invitesRetryLaterPagedata");
        this.P = (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions");
        int a2 = mfx.a(getIntent());
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a = hdg.a(this, a2);
        this.a = walletCustomTheme;
        this.G = j();
        mhi mhi = new mhi(this, this.b, this.L, this.F);
        this.h = mhi;
        mhi.a(this.G, 2);
        this.o = new SmsSentReceiver(this.e);
        this.d = new mhe(this, SmsManager.getDefault());
        mfv.c("SendInvChimeraActivity", "Registered broadcast receiver", new Object[0]);
        getApplicationContext().registerReceiver(this.o, new IntentFilter("com.google.android.gms.family.invites"));
        if (this.l == null) {
            wlr a3 = wls.a();
            a3.a = 80;
            wls a4 = a3.a();
            ibz ibz = new ibz(this);
            ibz.a(this.b);
            ibz.a(wlt.a, (ibj) a4);
            ibq ibq = adws.a;
            adwq adwq = new adwq();
            adwq.a = axgd.c() ^ true ? 1 : 0;
            ibz.a(ibq, (ibj) adwq.a());
            ibz.a((Activity) this, (icb) this);
            this.l = ibz.b();
        }
        wlh wlh = new wlh();
        wlh.a = 0;
        wlh.b();
        this.m = wlh.a();
        if (bundle != null) {
            this.j = bundle.getInt("currentState");
            this.c = bundle.getParcelableArrayList("selectedContacts");
            this.D = bundle.getBoolean("selectionActivityLaunched");
            this.E = bundle.getBoolean("permissionRecoveryLaunched");
            this.r = bundle.getBoolean("creationFailed");
            this.s = bundle.getParcelableArrayList("failedSendingContacts");
            this.x = bundle.getInt("numInvitationsSentSuccessfully");
            this.y = bundle.getInt("numInvitationsSendingFailures");
            this.z = bundle.getInt("numInvited");
            this.A = bundle.getBoolean("retried");
        } else {
            this.j = 1;
            this.D = false;
        }
        mgx mgx = new mgx(this, this, getIntent().getBooleanExtra("disable-sms-invites", false));
        this.p = mgx;
        if (!this.E) {
            mgx.a(true);
            this.E = true;
            return;
        }
        a(this.C, this.B);
    }

    public final void onDestroy() {
        mhi mhi = this.h;
        if (mhi != null) {
            mhi.a(this.G, 3);
        }
        mfv.c("SendInvChimeraActivity", "Unregistered broadcast receiver", new Object[0]);
        getApplicationContext().unregisterReceiver(this.o);
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("selectionActivityLaunched", this.D);
        bundle.putBoolean("permissionRecoveryLaunched", this.E);
        bundle.putInt("currentState", this.j);
        bundle.putParcelableArrayList("selectedContacts", this.c);
        bundle.putBoolean("creationFailed", this.r);
        bundle.putParcelableArrayList("failedSendingContacts", this.s);
        bundle.putInt("numInvitationsSentSuccessfully", this.x);
        bundle.putInt("numInvitationsSendingFailures", this.y);
        bundle.putInt("numInvited", this.z);
        bundle.putBoolean("retried", this.A);
    }

    private final void a(ViewGroup viewGroup, String str) {
        Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.fm_toolbar);
        toolbar.a((CharSequence) str);
        if (j()) {
            toolbar.b(-16777216);
            toolbar.setBackgroundResource(17170443);
        }
    }

    private final void b(int i2, boolean z2) {
        Contact contact;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                contact = null;
                break;
            }
            contact = (Contact) arrayList.get(i3);
            i3++;
            if (contact.d == i2) {
                break;
            }
        }
        if (contact == null) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Failed to find contact in array, contactId:");
            sb.append(i2);
            mfv.e("SendInvChimeraActivity", sb.toString(), new Object[0]);
            return;
        }
        int i4 = contact.j;
        int i5 = 7;
        if (z2) {
            i5 = i4 != 10 ? 11 : 12;
        } else if (i4 != 1) {
            if (i4 != 5) {
                if (!(i4 == 6 || i4 == 7)) {
                    if (i4 != 9) {
                        if (i4 != 10) {
                            return;
                        }
                    }
                }
                i5 = 14;
            }
            i5 = 13;
        }
        contact.j = i5;
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("Updating state from: ");
        sb2.append(i4);
        sb2.append(" to: ");
        sb2.append(i5);
        mfv.c("SendInvChimeraActivity", sb2.toString(), new Object[0]);
    }

    private static void a(dwc dwc, ContactPickerOptionsData contactPickerOptionsData) {
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT", contactPickerOptionsData.f);
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT", contactPickerOptionsData.e);
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT", contactPickerOptionsData.d);
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT", contactPickerOptionsData.b);
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT", contactPickerOptionsData.c);
        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_TITLE", contactPickerOptionsData.a);
    }

    private final void b(Contact contact, boolean z2) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
        sb.append("Scheduling task for updating status for: ");
        sb.append(valueOf);
        sb.append(" sendSuccess: ");
        sb.append(z2);
        sb.toString();
        ith ith = mfv.a;
        this.n.initLoader(contact.d + 10000, (Bundle) null, new mha(this, contact, z2));
    }

    /* access modifiers changed from: package-private */
    public final void b(Contact contact) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Invitation sending failure received: ");
        sb.append(valueOf);
        sb.toString();
        ith ith = mfv.a;
        this.y++;
        this.s.add(contact);
        if (!TextUtils.isEmpty(contact.f)) {
            b(contact, false);
            return;
        }
        b(contact.d, false);
        i();
    }

    /* access modifiers changed from: package-private */
    public final synchronized int a(int i2) {
        mhc mhc;
        mhc = (mhc) this.q.get(i2, new mhc());
        return mhc.a + mhc.b;
    }

    public final void a() {
        a(0, this.z);
    }

    public final void a(int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra("num-invitations-sent", i3);
        intent.putExtra("num-invitations-created", this.y + this.x);
        if (k() && "agsa".equals(this.F) && axga.c()) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("direct-add-contacts-list", new ArrayList(a((Set) new HashSet(Arrays.asList(new Integer[]{15})))));
            intent.putExtras(bundle);
        }
        if (this.f.a() != null) {
            intent.putExtra("consistencyToken", this.f.a());
            intent.putExtra("tokenExpirationTimeSecs", this.f.b());
        }
        setResult(i2, intent);
        ArrayList arrayList = this.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            mhi mhi = this.h;
            boolean z2 = this.G;
            int i4 = this.H;
            int i5 = this.I;
            int i6 = this.J;
            int i7 = this.K;
            aucd o2 = big.g.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            big big = (big) o2.b;
            big.b = 3;
            int i8 = 1 | big.a;
            big.a = i8;
            int i9 = i8 | 2;
            big.a = i9;
            big.c = i4;
            int i10 = i9 | 4;
            big.a = i10;
            big.d = i5;
            int i11 = i10 | 8;
            big.a = i11;
            big.e = i6;
            big.a = i11 | 16;
            big.f = i7;
            big big2 = (big) o2.i();
            if (z2) {
                aucd o3 = bin.d.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                bin bin = (bin) o3.b;
                big2.getClass();
                bin.c = big2;
                bin.a |= 2;
                mhi.a((bin) o3.i());
            } else {
                aucd o4 = bih.d.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                bih bih = (bih) o4.b;
                big2.getClass();
                bih.c = big2;
                bih.a |= 2;
                mhi.a((bih) o4.i());
            }
        }
        finish();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, boolean z2) {
        mhc mhc = (mhc) this.q.get(i2, new mhc());
        if (z2) {
            mhc.a++;
        } else {
            mhc.b++;
        }
        this.q.put(i2, mhc);
    }

    public final void a(ConnectionResult connectionResult) {
        mfu.a(this, new mgy(this)).show();
    }

    public final void a(Contact contact) {
        if (contact.b()) {
            a(contact.d, true);
            if (a(contact.d) >= contact.h) {
                if (((mhc) this.q.get(contact.d, new mhc())).b != 0) {
                    b(contact);
                    return;
                }
            } else {
                return;
            }
        }
        this.x++;
        this.z++;
        if (contact.b()) {
            this.J++;
        } else {
            this.K++;
        }
        if (contact.b()) {
            b(contact, true);
            return;
        }
        b(contact.d, true);
        i();
    }

    public final void a(Contact contact, boolean z2) {
        String valueOf = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Invitation state updated for: ");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(z2);
        sb.toString();
        ith ith = mfv.a;
        b(contact.d, z2);
        i();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2) {
        int i3;
        this.x = 0;
        this.y = 0;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Contact contact = (Contact) arrayList.get(i4);
            int i5 = contact.j;
            if (i5 == 1) {
                i3 = 3;
            } else if (i5 != 7) {
            } else {
                i3 = 4;
            }
            contact.j = i3;
        }
        this.n.initLoader(i2, (Bundle) null, new mgz(this, getIntent().getStringExtra("appId"), str));
    }

    public final void a(List list) {
        int i2;
        if (!list.isEmpty()) {
            ith ith = mfv.a;
            this.r = true;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Contact contact = (Contact) list.get(i3);
                String valueOf = String.valueOf(contact);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Invitation creation failed: ");
                sb.append(valueOf);
                mfv.b("SendInvChimeraActivity", sb.toString(), new Object[0]);
                this.s.add(contact);
                int i4 = contact.j;
                if (i4 == 3) {
                    i2 = 7;
                } else if (i4 != 4) {
                } else {
                    i2 = 8;
                }
                contact.j = i2;
            }
            i();
        }
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        Intent intent;
        int i3;
        int i4;
        boolean z4 = z2;
        boolean z5 = z3;
        this.C = z4;
        this.B = z5;
        StringBuilder sb = new StringBuilder(39);
        sb.append("canReadContact: ");
        sb.append(z4);
        sb.append(" canSendSms: ");
        sb.append(z5);
        mfv.b("SendInvChimeraActivity", sb.toString(), new Object[0]);
        int i5 = this.j;
        if (i5 != 1) {
            if (i5 == 2) {
                e();
            } else if (i5 == 3) {
                l();
            } else if (i5 == 4) {
                f();
            }
        } else if (this.D) {
        } else {
            if (axfu.b()) {
                this.D = true;
                this.h.a(this.G, 10);
                this.P.j = getIntent().getIntExtra("max-available-slots", 5);
                if (k()) {
                    this.P.a(new int[]{0});
                } else if (this.B) {
                    this.P.a(new int[]{0, 1});
                } else {
                    this.P.a(new int[]{0});
                }
                Intent putExtra = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.contactpicker.ContactPickerActivity").putExtra("customTheme", getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", jlh.a(getIntent().getStringExtra("predefinedTheme"))).putExtra("contactPickerOptions", this.P);
                if (!axga.c() || !k() || !this.F.equals("agsa")) {
                    startActivityForResult(putExtra, 1);
                } else {
                    startActivityForResult(putExtra, 3);
                }
            } else {
                int intExtra = getIntent().getIntExtra("max-available-slots", 5);
                Resources resources = getResources();
                String stringExtra = getIntent().getStringExtra("sms-preview-text");
                TypedValue typedValue = new TypedValue();
                boolean resolveAttribute = getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                int parseColor = !resolveAttribute ? Color.parseColor("#1A73E8") : typedValue.data;
                if (!resolveAttribute) {
                    mfv.e("SendInvChimeraActivity", "Primary color resolving failed for App Invite theming", new Object[0]);
                }
                TypedValue typedValue2 = new TypedValue();
                boolean resolveAttribute2 = getTheme().resolveAttribute(R.attr.fmToolbarContentTint, typedValue2, true);
                if (resolveAttribute2) {
                    i2 = typedValue2.data;
                } else {
                    i2 = -1;
                }
                if (!resolveAttribute2) {
                    mfv.e("SendInvChimeraActivity", "Toolbar text color resolving failed for App Invite theming", new Object[0]);
                }
                int parseColor2 = Color.parseColor("#0c000000");
                int parseColor3 = Color.parseColor("#42000000");
                if (!axga.c() || !k() || !"agsa".equals(this.F)) {
                    if (!j()) {
                        i4 = resources.getColor(R.color.fm_navbar_background);
                        i3 = Color.parseColor("#1A73E8");
                    } else {
                        i4 = parseColor;
                        i3 = i2;
                        parseColor = -1;
                        i2 = -16777216;
                    }
                    dwc dwc = new dwc();
                    dwc.a(this.b);
                    dwc.a(i2, parseColor);
                    dwc.a();
                    dwc.b(i4, parseColor2);
                    dwc.c(i3, parseColor3);
                    boolean z6 = this.B;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("email");
                    if (z6) {
                        arrayList.add("phone");
                    }
                    dwc.a((String[]) arrayList.toArray(new String[arrayList.size()]));
                    dwc.b();
                    dwc.c("identityPeople");
                    dwc.c();
                    dwc.a(intExtra);
                    dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_MESSAGE", stringExtra);
                    dwc.b(hdg.a(this, 2132018216));
                    if (axga.a.a().f() && axgd.a.a().h()) {
                        if (axgd.a.a().g() || !this.C) {
                            dwc.b("identityPeople");
                        } else {
                            dwc.b("supplied");
                            ivy.a((Iterable) mgp.a(this, this.B), dwc.a, "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE");
                        }
                        dwc.a.putExtra("com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST", true);
                    }
                    a(dwc, this.P);
                    intent = dwc.a;
                } else {
                    int color = resources.getColor(R.color.fm_navbar_background);
                    int parseColor4 = Color.parseColor("#1A73E8");
                    dwc dwc2 = new dwc();
                    dwc2.a(this.b);
                    dwc2.a();
                    dwc2.a(i2, parseColor);
                    dwc2.b(color, parseColor2);
                    dwc2.c(parseColor4, parseColor3);
                    dwc2.a(axga.a.a().g() ? new String[]{"google", "google_no_icon"} : axga.a.a().b() ? new String[]{"email", "exclude_non_gaia"} : new String[]{"google"});
                    dwc2.b();
                    dwc2.c("identityPeople");
                    dwc2.c();
                    dwc2.a(intExtra);
                    dwc2.b(hdg.a(this, 2132018216));
                    a(dwc2, this.P);
                    intent = dwc2.a;
                }
                this.D = true;
                mfv.c("SendInvChimeraActivity", "Launching ContextualPeopleSelection activity.", new Object[0]);
                this.h.a(this.G, 10);
                if (!axga.c() || !k() || !this.F.equals("agsa")) {
                    startActivityForResult(intent, 1);
                } else {
                    startActivityForResult(intent, 3);
                }
            }
        }
    }
}
