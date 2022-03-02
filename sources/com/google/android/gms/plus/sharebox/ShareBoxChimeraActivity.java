package com.google.android.gms.plus.sharebox;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.circles.AddToCircleConsentData;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.model.posts.PlusPage;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShareBoxChimeraActivity extends FragmentActivity implements zmq, zmd, zmu, zlc, zkz, zkm, zle, ypc, yqc {
    protected zme a;
    protected zlx b;
    zms c;
    protected final Handler d = new zmb(this);
    private zmr e;
    private zmv f;
    private Audience g;
    private yqd h;
    private AddToCircleData i;
    private String j;
    private PlusCommonExtras k;

    private static final ActionTargetEntity a(List list) {
        zek zek = new zek();
        zek.a(list.size());
        zeo zeo = new zeo();
        zeo.a(zek.a());
        return (ActionTargetEntity) zeo.a();
    }

    private static final ClientActionDataEntity b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        zgh zgh = new zgh();
        zgh.a(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zgh.a());
        zfv zfv = new zfv();
        zge zge = new zge();
        zge.a(arrayList);
        zfv.a(zge.a());
        return (ClientActionDataEntity) zfv.a();
    }

    private final int c(int i2) {
        zlx zlx = this.b;
        if (zlx == null) {
            return 0;
        }
        if (i2 == 0) {
            return ((yoy) zlx.b.getListAdapter()).C;
        }
        if (i2 != 1) {
            return ((yoy) zlx.b.getListAdapter()).B;
        }
        return ((yoy) zlx.b.getListAdapter()).A;
    }

    private final void t() {
        if (((znc) getSupportFragmentManager().findFragmentByTag("post_error_dialog")) == null) {
            znc.a((int) R.string.plus_sharebox_post_error_message).show(getSupportFragmentManager(), "post_error_dialog");
        }
    }

    private final void u() {
        a((int) R.string.plus_sharebox_internal_error);
    }

    private final void v() {
        setResult(0);
        finish();
    }

    private final void w() {
        SharedPreferences.Editor edit = getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).edit();
        edit.putBoolean("pref_dont_ask_again", true);
        edit.apply();
    }

    public final boolean a() {
        return false;
    }

    public final void d() {
        this.a.e();
    }

    public final Audience e() {
        return this.g;
    }

    public final AddToCircleData f() {
        return this.i;
    }

    public final zmr g() {
        return this.e;
    }

    public final String getCallingPackage() {
        return this.j;
    }

    public final zmv h() {
        return this.f;
    }

    public final PlusCommonExtras i() {
        return this.k;
    }

    public final zms j() {
        return this.c;
    }

    public final void k() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        zld zld = (zld) supportFragmentManager.findFragmentByTag("create_circle_fragment");
        if (zld == null) {
            ArrayList arrayList = this.i.f;
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("circles", arrayList);
            zld = new zld();
            zld.setArguments(bundle);
        }
        zld.show(supportFragmentManager, "create_circle_fragment");
    }

    public final void l() {
        AddToCircleData addToCircleData;
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.plus.sharebox.AddToCircleActivity");
        zkt zkt = this.a.e;
        if (zkt != null) {
            addToCircleData = zkt.a;
        } else {
            addToCircleData = null;
        }
        intent.putExtra("add_to_circle_data", addToCircleData);
        intent.putExtra("calling_package_name", this.j);
        intent.putExtra("client_application_id", this.c.m);
        startActivityForResult(intent, 5);
    }

    public final yqd m() {
        return this.h;
    }

    public final void n() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.hide(this.a);
        beginTransaction.show(this.b);
        beginTransaction.addToBackStack("com.google.android.gms.plus.sharebox.show_acl_picker");
        beginTransaction.commit();
    }

    public final void o() {
        if (((zkn) getSupportFragmentManager().findFragmentByTag("underage_warning_dialog")) == null) {
            String string = getString(R.string.plus_sharebox_under_age_warning_title);
            String string2 = getString(R.string.plus_sharebox_under_age_warning_message);
            Bundle bundle = new Bundle();
            bundle.putString("title", string);
            bundle.putString("message", string2);
            zkn zkn = new zkn();
            zkn.setArguments(bundle);
            zkn.show(getSupportFragmentManager(), "underage_warning_dialog");
            this.e.a(iay.c, iay.g);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 || i2 == 2) {
            if (i3 == -1) {
                zmr zmr = this.e;
                zmr.i = jgu.a(jgu.d(zmr.getActivity(), zmr.h));
                zmr.b.t();
                return;
            }
            setResult(i3);
            finish();
        } else if (i2 == 3) {
            if (i3 != -1) {
                this.e.b(iax.t, iay.e);
            } else {
                this.e.b(iax.s, iay.e);
            }
            this.e.a(iay.e, ibb.a);
            setResult(i3);
            finish();
        } else if (i2 != 4) {
            if (i2 == 5 && i3 == -1 && intent != null) {
                AddToCircleData addToCircleData = (AddToCircleData) intent.getParcelableExtra("add_to_circle_data");
                this.i = addToCircleData;
                this.a.a(addToCircleData, true);
            }
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1 || i3 == 1 || i3 == 1) {
            this.e.a(Status.a, new AddToCircleConsentData(false, (String) null, (String) null, (String) null));
            q();
        } else {
            zkt zkt = this.a.e;
            if (zkt != null) {
                zkt.e.setChecked(false);
            }
            this.a.g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r3 = this;
            zlx r0 = r3.b
            boolean r0 = r0.isHidden()
            if (r0 != 0) goto L_0x0019
            zlx r0 = r3.b
            yok r1 = r0.c
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.isHidden()
            if (r1 == 0) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            r0.a()
            return
        L_0x0019:
            com.google.android.chimera.FragmentManager r0 = r3.getSupportFragmentManager()
            int r1 = r0.getBackStackEntryCount()
            if (r1 <= 0) goto L_0x002a
            int r1 = r1 + -1
            com.google.android.chimera.FragmentManager$BackStackEntry r0 = r0.getBackStackEntryAt(r1)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "com.google.android.gms.plus.sharebox.show_compose"
            boolean r1 = r2.equals(r1)
            java.lang.String r2 = "com.google.android.gms.plus.sharebox.show_acl_picker"
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = r0.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0048
            goto L_0x005c
        L_0x0048:
            zmr r0 = r3.e
            com.google.android.gms.common.server.FavaDiagnosticsEntity r1 = defpackage.iax.a
            r0.a((com.google.android.gms.common.server.FavaDiagnosticsEntity) r1)
            zme r0 = r3.a
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x006e
            android.os.Handler r0 = r3.d
            r1 = 1
            r0.sendEmptyMessage(r1)
            return
        L_0x005c:
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x006e
            yqd r0 = r3.h
            com.google.android.gms.common.people.data.Audience r1 = r3.g
            r0.a(r1, r3)
        L_0x006e:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.plus.sharebox.ShareBoxChimeraActivity.onBackPressed():void");
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.j = zmf.a((Activity) this);
        if (!jkf.a(this)) {
            a((int) R.string.plus_sharebox_no_network_connection);
            return;
        }
        PlusCommonExtras b2 = PlusCommonExtras.b(getIntent());
        this.k = b2;
        ykr.a(this, b2, "gpsb0");
        this.c = new zms(getIntent());
        boolean z2 = true;
        if (zmf.c(getIntent())) {
            String a2 = jhg.a((Activity) this);
            Intent intent = getIntent();
            if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(intent.getAction())) {
                if (intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) {
                    Log.e("ShareBox", "Cannot override the calling package when using the action: com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
                } else if (TextUtils.isEmpty(a2)) {
                    Log.e("ShareBox", "Must use startActivityForResult when using the action: com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE");
                } else if (hya.a((Context) this).b(a2)) {
                    zms zms = this.c;
                    Intent intent2 = getIntent();
                    String stringExtra = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_ID");
                    String stringExtra2 = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_IMAGE_URL");
                    String stringExtra3 = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.PLUS_PAGE_DISPLAY_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        zms.b = new PlusPage(stringExtra, stringExtra3, stringExtra2);
                    }
                    zms.c = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_NAME");
                    zms.d = intent2.getIntExtra("com.google.android.gms.plus.intent.extra.INTERNAL_APP_ICON_RESOURCE", -1);
                    zms.e = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.INTERNAL_SHARE_BUTTON_NAME");
                    zms.f = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.SHARE_CONTEXT_TYPE");
                    boolean a3 = zmf.a(this, zms.f);
                    zms.i = intent2.getIntExtra("com.google.android.gms.plus.intent.extra.OVERRIDE_FIRST_VIEW", a3 ? 1 : 0);
                    boolean z3 = !a3;
                    zms.j = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.SHOW_ACL_SUGGESTED_SECTION", z3);
                    zms.k = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.INCLUDE_SUGGESTIONS_WITH_PEOPLE", z3);
                    zms.l = intent2.getBooleanExtra("com.google.android.gms.plus.intent.extra.SHOW_ADD_TO_CIRCLE", z3);
                    zms.m = intent2.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_APPLICATION_ID");
                }
            }
            Log.e("ShareBox", "Invalid share action");
            v();
            return;
        }
        if (zmf.b(getIntent())) {
            Intent intent3 = getIntent();
            if (zmf.b(intent3)) {
                zmx a4 = zmx.a(intent3.getExtras());
                if (a4 == null || (a4.d() && !a4.b() && !a4.f())) {
                    Log.e("GooglePlusPlatform", "Mobile deep-link IDs must specify metadata.");
                }
            }
            Log.e("ShareBox", "Invalid deep link");
            v();
            return;
        }
        if (zmf.a(getIntent())) {
            Intent intent4 = getIntent();
            if (zmf.a(intent4)) {
                String a5 = jhg.a((Activity) this);
                String a6 = zmf.a((Activity) this);
                if (TextUtils.isEmpty(a5) || TextUtils.isEmpty(a6)) {
                    Log.e("GooglePlusPlatform", "Must use startActivityForResult when creating an interactive post.");
                } else {
                    zmx a7 = zmx.a(intent4.getExtras());
                    if (a7 == null || !a7.b()) {
                        Log.e("GooglePlusPlatform", "The contentUrl is required when creating an interactive post.");
                    } else if (zmw.a(intent4.getBundleExtra("com.google.android.apps.plus.CALL_TO_ACTION")) == null) {
                        Log.e("GooglePlusPlatform", "Call to action data is required when creating an interactive post.");
                    }
                }
            }
            Log.e("ShareBox", "Invalid interactive post");
            v();
            return;
        }
        setContentView((int) R.layout.plus_sharebox_activity);
        View findViewById = findViewById(R.id.post_container);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.plus_sharebox_container_margin);
        if (getResources().getBoolean(R.bool.plus_is_tablet)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            findViewById.setLayoutParams(marginLayoutParams);
        }
        if (bundle != null) {
            this.g = (Audience) bundle.getParcelable("audience");
            this.i = (AddToCircleData) bundle.getParcelable("addToCircleData");
            z2 = bundle.getBoolean("share_box_hidden");
            z = bundle.getBoolean("acl_hidden");
        } else {
            this.g = iww.a;
            this.i = new AddToCircleData(1, zkw.a(this), getResources().getString(R.string.plus_sharebox_circles_following_circle), (Audience) null, (Audience) null, (ArrayList) null, (Integer) null, (Boolean) null, (Boolean) null);
            z = true;
        }
        yqd yqd = new yqd(this.g);
        this.h = yqd;
        yqd.a(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        zmr zmr = (zmr) supportFragmentManager.findFragmentByTag("share_worker_fragment");
        this.e = zmr;
        if (zmr == null) {
            zmr a8 = zmr.a(this.c.a);
            this.e = a8;
            beginTransaction.add((Fragment) a8, "share_worker_fragment");
        }
        zmv zmv = (zmv) supportFragmentManager.findFragmentByTag("title_fragment");
        this.f = zmv;
        if (zmv == null) {
            zmv zmv2 = new zmv();
            this.f = zmv2;
            beginTransaction.add(R.id.title_container, zmv2, "title_fragment");
        }
        zme zme = (zme) supportFragmentManager.findFragmentByTag("share_fragment");
        this.a = zme;
        if (zme == null) {
            zme zme2 = new zme();
            this.a = zme2;
            beginTransaction.add(R.id.post_container, zme2, "share_fragment");
        }
        zlx zlx = (zlx) supportFragmentManager.findFragmentByTag("acl_fragment");
        this.b = zlx;
        if (zlx == null) {
            zlx zlx2 = new zlx();
            this.b = zlx2;
            beginTransaction.add(R.id.post_container, zlx2, "acl_fragment");
        }
        if (!z2) {
            beginTransaction.show(this.a);
        } else {
            beginTransaction.hide(this.a);
        }
        if (!z) {
            beginTransaction.show(this.b);
        } else {
            beginTransaction.hide(this.b);
        }
        beginTransaction.commit();
        if (bundle == null) {
            if (this.c.f() && this.c.o.d()) {
                this.e.a(iax.n);
            }
            if (this.c.g()) {
                this.e.a(iax.m);
            }
            Audience audience = this.c.q;
            if (audience != null && !ixb.a(audience)) {
                this.e.a(iax.o);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        zla zla = (zla) getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
        if (zla != null) {
            zla.a = this;
        }
        if (this.e.n != null) {
            findViewById(R.id.loading).setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("audience", this.g);
        bundle.putParcelable("addToCircleData", this.i);
        bundle.putBoolean("share_box_hidden", this.a.isHidden());
        bundle.putBoolean("acl_hidden", this.b.isHidden());
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View findViewById = findViewById(R.id.post_container);
        if (motionEvent.getAction() != 0 || !jgv.a(motionEvent, findViewById)) {
            return super.onTouchEvent(motionEvent);
        }
        onBackPressed();
        jjw.a(this, findViewById);
        return true;
    }

    public final void p() {
        if (!this.a.c()) {
            return;
        }
        if (!this.a.f() || this.e.o != null) {
            this.a.g();
        }
    }

    public final void q() {
        boolean z;
        if (this.a.f()) {
            zmr zmr = this.e;
            AddToCircleConsentData addToCircleConsentData = zmr.o;
            if (addToCircleConsentData.a) {
                startActivityForResult(ysf.a(zmr.j, this.c.b(), addToCircleConsentData.b, addToCircleConsentData.c, addToCircleConsentData.d, 80), 4);
                return;
            }
            zkt zkt = this.a.e;
            if (zkt != null) {
                String str = ((Circle) zkt.h.getSelectedItem()).d;
                zmr g2 = zkt.i.g();
                Audience f2 = zkt.a.f();
                if (!g2.u) {
                    ibq ibq = wlt.a;
                    xdp.a(g2.d, g2.e);
                    g2.u = true;
                    g2.v = str;
                    g2.w = f2;
                    if (g2.b.l()) {
                        g2.b();
                    } else if (!g2.b.m()) {
                        g2.b.t();
                    }
                } else {
                    throw new IllegalStateException("Add people to circle request already initiated");
                }
            }
        }
        if (ixb.a(this.g)) {
            n();
            return;
        }
        zme zme = this.a;
        Post post = null;
        if (!zme.c()) {
            zme.d.g().a(iax.f);
        } else {
            jjw.a(zme.getActivity(), zme.i);
            Uri parse = zme.d.j().e() ? Uri.parse(zme.d.j().n) : null;
            String a2 = zmf.a((Spannable) zme.i.getText());
            Bundle bundle = zme.d.j().g() ? zme.d.j().p.a : null;
            Bundle bundle2 = zme.d.j().f() ? zme.d.j().o.a : null;
            if (zme.l) {
                zme.d.g().a(iax.e, (FavaDiagnosticsEntity) null, ian.a(zme.h), (ActionTargetEntity) null);
                z = zme.k.isChecked();
            } else {
                z = true;
            }
            post = new Post((String) null, (List) null, parse, a2, (String) null, (String) null, bundle, bundle2, zme.d.j().f, Boolean.valueOf(z), zme.d.j().b(), zme.h);
            if (post.b()) {
                zme.d.g().a(iax.k);
            }
            if (post.a()) {
                zme.d.g().a(iax.c);
            }
            if (post.c()) {
                zme.d.g().a(iax.v);
            }
            if (!zme.c && post.l.c == 1) {
                zme.d.g().a(iax.C);
            }
            if (!zme.c && post.l.c == 2) {
                zme.d.g().a(iax.D);
            }
            if (zme.d.j().f() && zme.d.j().o.d()) {
                zme.d.g().a(iax.w);
            }
        }
        if (post != null) {
            znf a3 = znf.a((CharSequence) getString(R.string.plus_sharebox_post_pending));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add((Fragment) a3, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            zmr zmr2 = this.e;
            if (!zmr2.l) {
                zmr2.l = true;
                zmr2.m = post;
                if (zmr2.b.l()) {
                    zmr2.c.g(Bundle.EMPTY);
                } else if (!zmr2.b.m()) {
                    zmr2.b.t();
                }
            } else {
                throw new IllegalStateException("One post at a time please");
            }
        } else {
            t();
        }
    }

    public final void r() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.hide(this.b);
        beginTransaction.show(this.a);
        if (supportFragmentManager.getBackStackEntryCount() <= 0 || !"com.google.android.gms.plus.sharebox.show_acl_picker".equals(supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName())) {
            beginTransaction.addToBackStack("com.google.android.gms.plus.sharebox.show_compose");
        } else {
            supportFragmentManager.popBackStack("com.google.android.gms.plus.sharebox.show_acl_picker", 1);
        }
        beginTransaction.commit();
        a(this.h.a);
        zme zme = this.a;
        zme.c = true;
        zme.b();
    }

    public final void s() {
        this.b.a();
    }

    private final List a(int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        Audience audience = this.g;
        if (audience != null) {
            int size = audience.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                AudienceMember audienceMember = (AudienceMember) this.g.b.get(i4);
                Bundle bundle = audienceMember.h;
                int i5 = bundle.getInt("selectionSource");
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                int i6 = bundle.getInt("contactType");
                                if (i3 == 1 && i6 == 1) {
                                    a((List) arrayList, audienceMember);
                                }
                            } else if (i5 == 3) {
                                a((List) arrayList, audienceMember);
                            }
                        } else if (i5 == 2) {
                            a((List) arrayList, audienceMember);
                        }
                    } else if (i5 == 1) {
                        a((List) arrayList, audienceMember);
                    }
                } else if (i5 == 0) {
                    a((List) arrayList, audienceMember);
                }
            }
        }
        return arrayList;
    }

    private static final zgc c(String str) {
        String e2 = ycm.e(str);
        String g2 = ycm.g(str);
        zgb zgb = new zgb();
        if (!TextUtils.isEmpty(e2)) {
            zgb.b(e2);
        } else if (TextUtils.isEmpty(g2)) {
            return null;
        } else {
            zgb.a(g2);
        }
        return zgb.a();
    }

    private final void b(int i2) {
        Toast.makeText(this, i2, 0).show();
    }

    public final void b() {
        this.e.b(iax.u, iay.g);
    }

    public final void c() {
        this.e.a(iax.a);
        v();
    }

    public final void b(Audience audience) {
        AddToCircleData addToCircleData = this.i;
        addToCircleData.a(audience, addToCircleData.e);
        if (this.i.a()) {
            a(Status.a, this.i);
        }
    }

    public final void b(String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.remove(this.a);
        zme zme = new zme();
        this.a = zme;
        beginTransaction.add(R.id.post_container, zme, "share_fragment");
        beginTransaction.hide(this.a);
        beginTransaction.remove(this.b);
        zlx zlx = new zlx();
        this.b = zlx;
        beginTransaction.add(R.id.post_container, zlx, "acl_fragment");
        beginTransaction.hide(this.b);
        beginTransaction.remove(this.e);
        zmr a2 = zmr.a(str);
        this.e = a2;
        beginTransaction.add((Fragment) a2, "share_worker_fragment");
        zmf.a(this, str, this.j);
        beginTransaction.commit();
        while (supportFragmentManager.getBackStackEntryCount() > 0) {
            String name = supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName();
            if (!name.equals("com.google.android.gms.plus.sharebox.show_compose") && !name.equals("com.google.android.gms.plus.sharebox.show_acl_picker")) {
                break;
            }
            supportFragmentManager.popBackStackImmediate();
        }
        findViewById(R.id.loading).setVisibility(0);
        this.f.a(0);
    }

    private final void a(int i2) {
        b(i2);
        v();
    }

    private static final void a(List list, AudienceMember audienceMember) {
        zgc c2 = c(audienceMember.e);
        if (c2 != null) {
            list.add(c2);
        }
    }

    public final void a(Intent intent, boolean z) {
        this.e.b(iax.p, iay.d);
        if (z) {
            this.e.b(iax.r, iay.d);
            w();
        }
        try {
            startActivityForResult(intent, 3);
            this.e.a(iay.d, iay.e);
        } catch (ActivityNotFoundException e2) {
        }
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.a.a(bitmap);
        }
    }

    public final void a(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            u();
        } else if (connectionResult.a()) {
            try {
                connectionResult.a(getContainerActivity());
            } catch (IntentSender.SendIntentException e2) {
                Log.e("ShareBox", "Failed to start connection resolution");
                u();
            }
        } else if (!hxy.a(connectionResult.c, getContainerActivity())) {
            u();
            Log.e("ShareBox", "Failed to get GooglePlayServices dialog");
        }
    }

    public final void a(ConnectionResult connectionResult, Post post) {
        zlf zlf;
        Post post2 = post;
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
        if (connectionResult.b()) {
            b((int) R.string.plus_sharebox_post_success);
            List a2 = a(1, -1);
            int c2 = c(1);
            if (!a2.isEmpty()) {
                zmr zmr = this.e;
                FavaDiagnosticsEntity favaDiagnosticsEntity = iax.F;
                FavaDiagnosticsEntity favaDiagnosticsEntity2 = iay.a;
                ClientActionDataEntity b2 = b(a2);
                zek zek = new zek();
                zek.a(a2.size());
                if (c2 > 0) {
                    zek.d = ((float) a2.size()) / ((float) c2);
                    zek.i.add(9);
                }
                zeo zeo = new zeo();
                zeo.a(zek.a());
                zmr.a(favaDiagnosticsEntity, favaDiagnosticsEntity2, b2, (ActionTargetEntity) zeo.a());
            }
            List a3 = a(2, -1);
            int c3 = c(2);
            if (!a3.isEmpty()) {
                zmr zmr2 = this.e;
                FavaDiagnosticsEntity favaDiagnosticsEntity3 = iax.G;
                FavaDiagnosticsEntity favaDiagnosticsEntity4 = iay.a;
                ClientActionDataEntity b3 = b(a3);
                zek zek2 = new zek();
                zek2.a(a3.size());
                if (c3 > 0) {
                    zek2.f = ((float) a3.size()) / ((float) c3);
                    zek2.i.add(11);
                }
                zeo zeo2 = new zeo();
                zeo2.a(zek2.a());
                zmr2.a(favaDiagnosticsEntity3, favaDiagnosticsEntity4, b3, (ActionTargetEntity) zeo2.a());
            }
            List a4 = a(0, -1);
            int c4 = c(0);
            if (!a4.isEmpty()) {
                zmr zmr3 = this.e;
                FavaDiagnosticsEntity favaDiagnosticsEntity5 = iax.H;
                FavaDiagnosticsEntity favaDiagnosticsEntity6 = iay.a;
                ClientActionDataEntity b4 = b(a4);
                zek zek3 = new zek();
                zek3.a(a4.size());
                if (c4 > 0) {
                    zek3.b = ((float) a4.size()) / ((float) c4);
                    zek3.i.add(7);
                }
                zeo zeo3 = new zeo();
                zeo3.a(zek3.a());
                zmr3.a(favaDiagnosticsEntity5, favaDiagnosticsEntity6, b4, (ActionTargetEntity) zeo3.a());
            }
            List a5 = a(3, -1);
            if (!a5.isEmpty()) {
                this.e.a(iax.I, iay.a, b(a5), a(a5));
            }
            List a6 = a(-1, 1);
            if (!a6.isEmpty()) {
                this.e.a(iax.J, iay.a, b(a6), a(a6));
            }
            zmr zmr4 = this.e;
            FavaDiagnosticsEntity favaDiagnosticsEntity7 = iax.d;
            ClientActionDataEntity a7 = ian.a(this.g);
            String str = post2 != null ? post2.b : null;
            int size = a2.size();
            int size2 = a3.size();
            int size3 = a4.size();
            zeo zeo4 = new zeo();
            zeo4.a = str;
            zeo4.c.add(5);
            zeo4.a(c4);
            zek zek4 = new zek();
            zek4.a = size3;
            zek4.i.add(6);
            zek4.c = size;
            zek4.i.add(8);
            zek4.e = size2;
            zek4.i.add(10);
            zek4.g = c2;
            zek4.i.add(13);
            zek4.h = c3;
            zek4.i.add(14);
            zek4.a(size + size2 + size3);
            zeo4.a(zek4.a());
            zmr4.a(favaDiagnosticsEntity7, (FavaDiagnosticsEntity) null, a7, (ActionTargetEntity) zeo4.a());
            if (getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).getBoolean("pref_dont_ask_again", false) || jhg.g(this, "com.google.android.apps.plus")) {
                setResult(-1);
                finish();
                return;
            }
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("install_app_dialog");
            if (findFragmentByTag == null) {
                int i2 = zlf.a;
                iva.b(!jhg.g(this, "com.google.android.apps.plus"));
                Bundle bundle = new Bundle();
                bundle.putString("dialog_title", getString(R.string.plus_install_app_dialog_title));
                bundle.putString("dialog_message", getString(R.string.plus_install_app_dialog_message));
                bundle.putString("target_package", "com.google.android.apps.plus");
                zlf = new zlf();
                zlf.setArguments(bundle);
            } else {
                zlf = (zlf) findFragmentByTag;
            }
            zlf.show(getSupportFragmentManager(), "install_app_dialog");
            return;
        }
        this.e.a(iax.f);
        t();
    }

    public final void a(ConnectionResult connectionResult, Settings settings) {
        boolean z;
        int i2;
        int i3;
        List list;
        Settings settings2 = settings;
        if (connectionResult.b() && settings2 != null) {
            findViewById(R.id.loading).setVisibility(8);
            this.a.a(settings2);
            zlx zlx = this.b;
            FragmentManager childFragmentManager = zlx.getChildFragmentManager();
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            zlx.b = (yny) childFragmentManager.findFragmentByTag("selection");
            if (zlx.b == null) {
                if (zlx.a.g().n.f > 0) {
                    i3 = zlx.a.g().n.g;
                    i2 = 0;
                } else {
                    i2 = zlx.a.g().n.g;
                    i3 = 0;
                }
                if (zlx.a.j().q != null) {
                    list = zlx.a.j().q.b;
                } else {
                    list = null;
                }
                zlx.b = yny.a(zlx.a.g().j, zlx.a.j().b(), zlx.a.j().j, true, true, true, (Integer) null, (String) null, zlx.a.j().m, zlx.a.getCallingPackage(), zlx.a.e().c, zlx.a.j().k, i3, i2, 0, list);
                yny yny = zlx.b;
                yny.d = true;
                boolean z2 = settings2.d;
                yny.c = z2;
                AudienceView audienceView = yny.b;
                if (audienceView != null) {
                    audienceView.a(z2);
                }
                beginTransaction.add(R.id.acl_fragment_container, zlx.b, "selection");
            }
            zlx.c = (yok) childFragmentManager.findFragmentByTag("search");
            if (zlx.c == null) {
                String str = zlx.a.g().j;
                String b2 = zlx.a.j().b();
                boolean a2 = zmf.a(zlx.getActivity(), zlx.a.j().f);
                String str2 = zlx.a.j().m;
                String callingPackage = zlx.a.getCallingPackage();
                zlz zlz = new zlz();
                zlz.setArguments(yok.a(str, b2, false, true, true, true, !a2, true, str2, callingPackage));
                zlx.c = zlz;
                beginTransaction.add(R.id.acl_fragment_container, zlx.c, "search");
            }
            beginTransaction.show(zlx.b);
            beginTransaction.hide(zlx.c);
            beginTransaction.commitAllowingStateLoss();
            if (zlx.a.e().c != 0) {
                zlx.getLoaderManager().restartLoader(0, (Bundle) null, zlx);
            }
            int i4 = this.c.i;
            if (i4 != 1) {
                z = i4 != 2 ? settings2.e : true;
            } else {
                z = false;
            }
            FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
            beginTransaction2.show(!z ? this.a : this.b);
            beginTransaction2.commitAllowingStateLoss();
            if (z) {
                this.e.a(iax.E);
                return;
            }
            return;
        }
        if (Log.isLoggable("ShareBox", 5)) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Failed to load settings: ");
            sb.append(valueOf);
            Log.w("ShareBox", sb.toString());
        }
        this.e.a(iax.f);
        u();
    }

    public final void a(ConnectionResult connectionResult, ysw ysw) {
        zme zme = this.a;
        if (!connectionResult.b()) {
            ysw = null;
        }
        zme.a(ysw);
    }

    public final void a(Status status) {
        if (!status.c()) {
            this.a.d();
        }
        p();
    }

    public final void a(Status status, AddToCircleData addToCircleData) {
        if (status.c() && addToCircleData != null) {
            this.a.a(addToCircleData, false);
            return;
        }
        Log.e("ShareBox", "Failed to load add-to-circle data");
        this.a.d();
    }

    public final void a(Status status, Circle circle) {
        int i2;
        if (status.c()) {
            zkt zkt = this.a.e;
            if (zkt != null) {
                zkx zkx = zkt.g;
                zkx.a.add(circle);
                zkx.notifyDataSetChanged();
                zkx zkx2 = zkt.g;
                if (!zkx2.a.isEmpty() && zkx2.a()) {
                    i2 = zkx2.a.size() - 1;
                } else {
                    i2 = zkx2.a.size();
                }
                zkt.b = i2;
                zkt.h.setSelection(i2);
                if (zkt.e.isEnabled()) {
                    zkt.e.setChecked(true);
                }
            }
            zmr zmr = this.e;
            FavaDiagnosticsEntity favaDiagnosticsEntity = ibd.a;
            String str = circle.d;
            ArrayList arrayList = new ArrayList();
            zfy zfy = new zfy();
            zfy.a(str);
            arrayList.add(zfy.a());
            zfv zfv = new zfv();
            zfs zfs = new zfs();
            zfs.a(arrayList);
            zfv.a(zfs.a());
            zmr.a(favaDiagnosticsEntity, (FavaDiagnosticsEntity) null, (ClientActionDataEntity) zfv.a(), (ActionTargetEntity) null);
            return;
        }
        this.a.e();
        b((int) R.string.plus_sharebox_circles_create_failed);
    }

    public final void a(Status status, String str, String[] strArr) {
        int i2;
        int i3;
        int i4;
        if (status.c()) {
            zmr zmr = this.e;
            FavaDiagnosticsEntity favaDiagnosticsEntity = ibd.b;
            ArrayList arrayList = new ArrayList();
            zfy zfy = new zfy();
            zfy.a(str);
            arrayList.add(zfy.a());
            ArrayList arrayList2 = new ArrayList();
            if (strArr != null) {
                i2 = strArr.length;
            } else {
                i2 = 0;
            }
            for (int i5 = 0; i5 < i2; i5++) {
                zgc c2 = c(strArr[i5]);
                if (c2 != null) {
                    arrayList2.add(c2);
                }
            }
            zfv zfv = new zfv();
            zfv.a((List) arrayList);
            if (!arrayList2.isEmpty()) {
                zfv.a = arrayList2;
                zfv.b.add(8);
            }
            zfw a2 = zfv.a();
            zeo zeo = new zeo();
            zeo.a(c(0));
            zek zek = new zek();
            if (strArr != null) {
                i3 = strArr.length;
            } else {
                i3 = 0;
            }
            zek.a(i3);
            zeo.a(zek.a());
            zmr.a(favaDiagnosticsEntity, (FavaDiagnosticsEntity) null, (ClientActionDataEntity) a2, (ActionTargetEntity) zeo.a());
            zmr zmr2 = this.e;
            FavaDiagnosticsEntity favaDiagnosticsEntity2 = iaw.a;
            ArrayList arrayList3 = new ArrayList();
            zfy zfy2 = new zfy();
            zfy2.a(str);
            arrayList3.add(zfy2.a());
            ArrayList arrayList4 = new ArrayList();
            if (strArr != null) {
                i4 = strArr.length;
            } else {
                i4 = 0;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                zgc c3 = c(strArr[i6]);
                if (c3 != null) {
                    arrayList4.add(c3);
                }
            }
            zgh zgh = new zgh();
            zgh.a = arrayList3;
            zgh.b.add(2);
            if (!arrayList4.isEmpty()) {
                zgh.a(arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(zgh.a());
            zfv zfv2 = new zfv();
            zge zge = new zge();
            zge.a(arrayList5);
            zfv2.a(zge.a());
            zmr2.a(favaDiagnosticsEntity2, (FavaDiagnosticsEntity) null, (ClientActionDataEntity) zfv2.a(), (ActionTargetEntity) null);
            return;
        }
        b((int) R.string.plus_sharebox_circles_add_to_circle_failed);
    }

    public final void a(Audience audience) {
        this.h.a(audience, this);
    }

    public final void a(Object obj) {
        Audience audience = this.h.a;
        this.g = audience;
        this.a.a(audience);
        b(this.g);
    }

    public final void a(String str) {
        zmr zmr = this.e;
        if (!zmr.s) {
            ibq ibq = wlt.a;
            xdp.a(zmr.d, zmr.e);
            zmr.s = true;
            zmr.t = str;
            if (zmr.d.i()) {
                xcy.a(zmr.d, zmr.j, zmr.g.b(), zmr.t).a(zmr.D);
            } else if (!zmr.d.j()) {
                zmr.d.e();
            }
        } else {
            throw new IllegalStateException("Create circle request already initiated");
        }
    }

    public final void a(boolean z) {
        this.e.b(iax.q, iay.d);
        if (z) {
            this.e.b(iax.r, iay.d);
            w();
        }
        this.e.a(iay.d, ibb.a);
        setResult(-1);
        finish();
    }

    public final void a(String[] strArr, int i2) {
        zmv zmv = this.f;
        if (zmv != null) {
            zmv.a(strArr, i2);
        }
    }
}
