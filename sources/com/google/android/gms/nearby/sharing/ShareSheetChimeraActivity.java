package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.ContentView;
import com.google.android.gms.nearby.sharing.view.LoadingButton;
import com.google.android.gms.nearby.sharing.view.RadarView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShareSheetChimeraActivity extends vhg implements vtx, vul {
    private static AccessibilityManager w;
    private ContentView A;
    private View B;
    private Button C;
    private Button D;
    private Button E;
    private Button F;
    private Button G;
    private Button H;
    private uhi I;
    private boolean J;
    private boolean K = false;
    private View L;
    private RecyclerView M;
    private vuq N;
    private vup O;
    private View P;
    private RecyclerView Q;
    private vuq R;
    private vup S;
    public final vsh h = new vse(this);
    public View i;
    public LoadingButton j;
    public View k;
    public View l;
    public ShareTarget m;
    public ShareTarget n;
    public final Map o = new ArrayMap();
    public boolean p = false;
    public View q;
    public RadarView r;
    public TextView s;
    public RadarView t;
    public int u = 1;
    private vna v;
    private final BroadcastReceiver x = new nla("nearby") {
        public final void a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                ShareSheetChimeraActivity.this.j();
            }
        }
    };
    private final BroadcastReceiver y = new nla("nearby") {
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                java.lang.String r6 = r7.getAction()
                if (r6 == 0) goto L_0x0075
                java.lang.String r6 = r7.getAction()
                int r0 = r6.hashCode()
                r1 = -1875733435(0xffffffff90329445, float:-3.5218533E-29)
                r2 = 2
                r3 = 1
                r4 = -1
                if (r0 == r1) goto L_0x0035
                r1 = -1530327060(0xffffffffa4c90fec, float:-8.719683E-17)
                if (r0 == r1) goto L_0x002b
                r1 = -511271086(0xffffffffe1869f52, float:-3.10418E20)
                if (r0 == r1) goto L_0x0021
                goto L_0x003f
            L_0x0021:
                java.lang.String r0 = "android.location.MODE_CHANGED"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x003f
                r6 = 0
                goto L_0x0040
            L_0x002b:
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x003f
                r6 = 1
                goto L_0x0040
            L_0x0035:
                java.lang.String r0 = "android.net.wifi.WIFI_STATE_CHANGED"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x003f
                r6 = 2
                goto L_0x0040
            L_0x003f:
                r6 = -1
            L_0x0040:
                if (r6 == 0) goto L_0x0070
                if (r6 == r3) goto L_0x005a
                if (r6 == r2) goto L_0x0047
                goto L_0x0069
            L_0x0047:
                java.lang.String r6 = "wifi_state"
                int r6 = r7.getIntExtra(r6, r4)
                r7 = 3
                if (r6 != r7) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                if (r6 != r3) goto L_0x0069
            L_0x0054:
                com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity r6 = com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.this
                r6.j()
                return
            L_0x005a:
                java.lang.String r6 = "android.bluetooth.adapter.extra.STATE"
                int r6 = r7.getIntExtra(r6, r4)
                r7 = 12
                if (r6 != r7) goto L_0x0065
                goto L_0x006a
            L_0x0065:
                r7 = 10
                if (r6 == r7) goto L_0x006a
            L_0x0069:
                return
            L_0x006a:
                com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity r6 = com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.this
                r6.j()
                return
            L_0x0070:
                com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity r6 = com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.this
                r6.j()
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity.AnonymousClass2.a(android.content.Context, android.content.Intent):void");
        }
    };
    private TextView z;

    private final void a(int i2, String str) {
        CharSequence charSequence;
        String str2;
        if (this.z.getTag(R.id.toolbar_title) != null) {
            charSequence = (CharSequence) this.z.getTag(R.id.toolbar_title);
        } else {
            charSequence = this.z.getText();
        }
        switch (i2) {
            case 1:
                str2 = getString(R.string.sharing_status_connecting);
                break;
            case 2:
            case 3:
                if (str != null) {
                    str2 = getString(R.string.sharing_status_waiting_sender_with_token);
                    break;
                } else {
                    str2 = getString(R.string.sharing_status_waiting_sender_without_token);
                    break;
                }
            case 4:
            case 7:
                str2 = getString(R.string.sharing_status_failed);
                break;
            case 5:
                str2 = getString(R.string.sharing_status_sending);
                break;
            case 6:
                str2 = getString(R.string.sharing_status_sent);
                break;
            case 8:
                str2 = getString(R.string.sharing_status_rejected);
                break;
            case 9:
                str2 = getString(R.string.sharing_status_cancelled);
                break;
            case 10:
                str2 = getString(R.string.sharing_status_timed_out);
                break;
            case 11:
                str2 = getString(R.string.sharing_status_media_unavailable);
                break;
            case 12:
                str2 = getString(R.string.sharing_status_media_downloading);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                str2 = getString(R.string.sharing_status_not_enough_space);
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                str2 = getString(R.string.sharing_status_unsupported_attachment_type);
                break;
            default:
                str2 = getString(R.string.sharing_product_name);
                break;
        }
        if (TextUtils.equals(charSequence, str2)) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.z.setText(str2);
            invalidateOptionsMenu();
            return;
        }
        this.z.setTag(R.id.toolbar_title, str2);
        this.i.animate().alpha(0.0f).setDuration(250).withEndAction(new vri(this));
    }

    private final void c(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int i2;
        this.v.b(shareTarget);
        this.m = shareTarget;
        if (!g(shareTarget).a(shareTarget)) {
            a(shareTarget);
        }
        if (this.q.getVisibility() != 0) {
            e(shareTarget);
        }
        int b = g(shareTarget).b((Object) shareTarget);
        g(shareTarget).a(shareTarget, transferMetadata);
        g(shareTarget).a(j(shareTarget), b);
        if (ayni.l()) {
            j(shareTarget).a.setOnClickListener((View.OnClickListener) null);
        }
        g(shareTarget).as();
        a(transferMetadata.a, transferMetadata.c);
        a(transferMetadata.a, transferMetadata.c, shareTarget);
        if (transferMetadata.e) {
            h();
            i2 = 3;
        } else {
            i2 = 2;
        }
        this.u = i2;
    }

    private static boolean h(ShareTarget shareTarget) {
        return !ayni.m() || !shareTarget.n;
    }

    private final View i(ShareTarget shareTarget) {
        return !h(shareTarget) ? this.P : this.L;
    }

    private final vup j(ShareTarget shareTarget) {
        return !h(shareTarget) ? this.S : this.O;
    }

    private final void l() {
        this.r.b();
        if (ayni.m()) {
            this.t.b();
        }
    }

    public final void b(ShareTarget shareTarget) {
        i(shareTarget).animate().alpha(1.0f).setDuration(150).setStartDelay(150).setInterpolator(new OvershootInterpolator()).start();
        f(shareTarget).animate().alpha(0.0f).setDuration(150).withEndAction(new vrh(this, shareTarget)).start();
    }

    public final void d(ShareTarget shareTarget) {
        int i2 = g(shareTarget).b(shareTarget).a;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 12) {
            this.b.b(shareTarget);
            jjg jjg = vvj.a;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.ShareSheetActivity"}));
        List list = this.N.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShareTarget shareTarget = (ShareTarget) list.get(i2);
            printWriter.write(String.format("  %s\n", new Object[]{shareTarget}));
            printWriter.write(String.format("  %s\n", new Object[]{this.N.b(shareTarget)}));
        }
        printWriter.write(String.format("  RecyclerView child count: %s\n", new Object[]{Integer.valueOf(this.M.getChildCount())}));
        if (ayni.m()) {
            List list2 = this.R.e;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ShareTarget shareTarget2 = (ShareTarget) list2.get(i3);
                printWriter.write(String.format("  %s\n", new Object[]{shareTarget2}));
                printWriter.write(String.format("  %s\n", new Object[]{this.R.b(shareTarget2)}));
            }
            printWriter.write(String.format("  External recyclerView child count: %s\n", new Object[]{Integer.valueOf(this.Q.getChildCount())}));
        }
        printWriter.flush();
    }

    public final void e(ShareTarget shareTarget) {
        int b = g(shareTarget).b((Object) shareTarget);
        if (b != -1) {
            g(shareTarget).a(j(shareTarget), b);
            this.q.setVisibility(0);
            this.k.setVisibility(4);
            this.d.setMinimumHeight((int) getResources().getDimension(R.dimen.sharing_receiver_surface_content_min_height));
        }
    }

    public final RecyclerView f(ShareTarget shareTarget) {
        return !h(shareTarget) ? this.Q : this.M;
    }

    public final vuq g(ShareTarget shareTarget) {
        return !h(shareTarget) ? this.R : this.N;
    }

    public final void k() {
        tcn.c(this).t().a((acvv) new vrp(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1000) {
            if (i2 != 1005) {
                if (i2 != 1006) {
                    super.onActivityResult(i2, i3, intent);
                } else {
                    j();
                }
            } else if (i3 == -1) {
                j();
            } else if (ayni.O()) {
                Toast.makeText(this, getString(R.string.sharing_enable_failed_location), 0).show();
            } else {
                a(getString(R.string.sharing_required_service_location));
            }
        } else if (i3 != -1) {
            finish();
        } else {
            j();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        char c;
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        if (!ayni.p()) {
            this.K = true;
            finish();
            return;
        }
        sv.o();
        setContentView((int) R.layout.sharing_activity_share_sheet);
        this.I = uhi.a(getContainerActivity());
        w = (AccessibilityManager) getSystemService("accessibility");
        this.v = vna.a((Context) this);
        View findViewById = findViewById(R.id.toolbar_wrapper);
        this.i = findViewById;
        a((Toolbar) findViewById.findViewById(R.id.toolbar));
        int i2 = 0;
        aE().c(false);
        this.z = (TextView) this.i.findViewById(R.id.toolbar_title);
        a(0, (String) null);
        View findViewById2 = findViewById(R.id.nav_bar);
        this.B = findViewById2;
        this.C = (Button) findViewById2.findViewById(R.id.close_btn);
        this.D = (Button) this.B.findViewById(R.id.accept_btn);
        this.E = (Button) this.B.findViewById(R.id.reject_btn);
        this.F = (Button) this.B.findViewById(R.id.cancel_btn);
        this.G = (Button) this.B.findViewById(R.id.done_btn);
        this.H = (Button) this.B.findViewById(R.id.retry_btn);
        this.j = (LoadingButton) findViewById(R.id.enable_btn);
        this.C.setOnClickListener(new vqz(this));
        this.D.setOnClickListener(new vrk(this));
        this.E.setOnClickListener(new vrv(this));
        this.F.setOnClickListener(new vrx(this));
        this.G.setOnClickListener(new vry(this));
        this.H.setOnClickListener(new vrz(this));
        this.j.setOnClickListener(new vsa(this));
        a(0, (String) null, (ShareTarget) null);
        ContentView contentView = (ContentView) findViewById(R.id.content_preview);
        this.A = contentView;
        ShareTarget shareTarget = this.m;
        if (shareTarget == null) {
            Intent intent = getIntent();
            if (!ayni.R() || !intent.hasExtra("android.intent.extra.WIFI_CREDENTIALS_BUNDLE")) {
                c = wih.a(intent) == null ? (char) 2 : 3;
            } else {
                c = 4;
            }
            if (c == 4) {
                contentView.a(Collections.singletonList(whp.a(intent)));
            } else if (c == 3) {
                contentView.a(Collections.singletonList(whp.a((Context) this, intent)));
            } else if (whp.b(intent).startsWith("image")) {
                contentView.a(whw.a(intent));
            } else {
                contentView.a((List) new ArrayList());
                new wip(getApplicationContext(), new wio(contentView), intent).start();
            }
        } else {
            List b = shareTarget.b();
            if (!b.isEmpty()) {
                if (whp.a(b, 1)) {
                    Uri[] uriArr = new Uri[b.size()];
                    for (int i3 = 0; i3 < b.size(); i3++) {
                        uriArr[i3] = ((FileAttachment) b.get(i3)).d;
                    }
                    contentView.a(uriArr);
                }
            }
            contentView.a(b);
        }
        this.k = findViewById(R.id.body);
        this.r = (RadarView) findViewById(R.id.sharing_radar);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        this.M = recyclerView;
        recyclerView.setLayoutManager(new abk(0));
        vuq a = vuq.a((Context) this, (vul) this);
        this.N = a;
        this.M.setAdapter(a);
        if (ayni.P()) {
            this.l = findViewById(R.id.missing_permissions_103);
        } else {
            this.l = findViewById(R.id.missing_permissions);
        }
        View findViewById3 = findViewById(R.id.empty_view);
        this.L = findViewById3;
        this.s = (TextView) findViewById3.findViewById(R.id.empty_view_description);
        if (!ayni.y()) {
            TextView textView = (TextView) findViewById(R.id.help_link_text_old);
            textView.setVisibility(0);
            ((ViewGroup.MarginLayoutParams) findViewById(R.id.help_link_text).getLayoutParams()).setMargins(0, wid.a(this, 16), 0, 0);
            textView.setOnClickListener(new vsc(this));
        } else {
            TextView textView2 = (TextView) findViewById(R.id.help_link_text);
            String valueOf = String.valueOf(textView2.getText());
            String string = getString(R.string.sharing_receive_surface_learn_more);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            String sb2 = sb.toString();
            int length = textView2.getText().length();
            int length2 = sb2.length();
            textView2.setText(sb2);
            wil.a(textView2, length + 1, length2, (View.OnClickListener) new vsd(this));
        }
        View findViewById4 = findViewById(R.id.enlarged_view);
        this.q = findViewById4;
        this.O = this.N.a(findViewById4);
        TextView textView3 = (TextView) findViewById(R.id.debug_text);
        if (ayni.J()) {
            textView3.setText(why.a(this));
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        this.t = (RadarView) findViewById(R.id.sharing_radar_external);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.list_external);
        this.Q = recyclerView2;
        recyclerView2.setLayoutManager(new abk(0));
        vuq a2 = vuq.a((Context) this, (vul) this);
        this.R = a2;
        this.Q.setAdapter(a2);
        this.P = findViewById(R.id.empty_view_external);
        this.S = this.R.a(this.q);
        ((TextView) findViewById(R.id.empty_view_title_external)).setText("Looking for OEM devices");
        View findViewById5 = findViewById(R.id.scan_section_external);
        if (!ayni.m()) {
            i2 = 8;
        }
        findViewById5.setVisibility(i2);
        this.u = 1;
        ((anih) vvj.a.d()).a("ShareSheetActivity has been created in %s millis", System.currentTimeMillis() - currentTimeMillis);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharing_menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        recreate();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == R.id.action_settings) {
            startActivity(SettingsChimeraActivity.a((Context) this));
            jjg jjg = vvj.a;
            return true;
        } else if (menuItem.getItemId() != R.id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            tcn.c(this).t().a((acvv) new vrb(this));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a(true);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_settings);
        this.b.t().a((acvv) new vra(this, findItem));
        int i2 = this.u;
        findItem.setVisible(i2 == 1 || i2 == 4);
        aE().b(this.m == null);
        menu.findItem(R.id.action_feedback).setVisible(ayni.K());
        int i3 = 0;
        for (int i4 = 0; i4 < menu.size(); i4++) {
            if (menu.getItem(i4).isVisible()) {
                i3++;
            }
        }
        int max = Math.max(1, i3) * wid.a(this, 48);
        TextView textView = this.z;
        textView.setPadding(max, textView.getPaddingTop(), max, this.z.getPaddingBottom());
        wil.a((Context) this, this.z, getResources().getDimension(R.dimen.sharing_toolbar_title_text_size_default), getResources().getDimension(R.dimen.sharing_toolbar_title_text_size_min));
        CharSequence charSequence = (CharSequence) this.z.getTag(R.id.toolbar_title);
        if (!TextUtils.isEmpty(charSequence)) {
            this.z.setTag(R.id.toolbar_title, (Object) null);
            this.z.setText(charSequence);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
        a((vhf) new vsb(this));
        ((anih) vvj.a.d()).a("ShareSheetActivity has resumed.");
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.K) {
            long currentTimeMillis = System.currentTimeMillis();
            super.onStart();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            registerReceiver(this.y, intentFilter);
            thp.a(this, this.x, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            j();
            invalidateOptionsMenu();
            ShareTarget shareTarget = this.m;
            if (shareTarget != null) {
                a(shareTarget);
                e(shareTarget);
            }
            ((anih) vvj.a.d()).a("ShareSheetActivity has started in %s millis", System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.K) {
            h();
            thp.a((Context) this, this.y);
            thp.a((Context) this, this.x);
            super.onStop();
            ((anih) vvj.a.d()).a("ShareSheetActivity has stopped");
            return;
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!this.K) {
            this.z.setText((CharSequence) null);
            c(shareTarget, transferMetadata);
        }
    }

    public final void h() {
        if (this.J) {
            this.b.b((vtx) this);
            l();
            this.J = false;
            uhi uhi = this.I;
            uhi.c = false;
            uhi.a();
            jjg jjg = vvj.a;
        }
    }

    public final void i() {
        List list = this.N.e;
        if (!list.isEmpty()) {
            ShareTarget shareTarget = (ShareTarget) list.get(0);
            g(shareTarget).c();
            b(shareTarget);
        }
        if (!this.R.e.isEmpty()) {
            ShareTarget shareTarget2 = (ShareTarget) list.get(0);
            g(shareTarget2).c();
            b(shareTarget2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.b.p().a((acvv) new vrl(this, wia.a((Context) this), wht.a(), win.a((Context) this)));
    }

    public final void c(ShareTarget shareTarget) {
        b(shareTarget, new vtv(1).a());
        vts vts = this.b;
        Intent intent = getIntent();
        iha b = ihb.b();
        b.a = new vsr(shareTarget, intent);
        b.b = new Feature[]{tcm.a};
        vts.b(b.a());
        this.u = 2;
        this.p = false;
        jjg jjg = vvj.a;
    }

    public static boolean a(ShareTarget shareTarget, ShareTarget shareTarget2) {
        if (shareTarget.a != shareTarget2.a) {
            return ius.a(shareTarget.b, shareTarget2.b) && ius.a(shareTarget.c, shareTarget2.c) && ius.a(Integer.valueOf(shareTarget.d), Integer.valueOf(shareTarget2.d)) && ius.a(shareTarget.j, shareTarget2.j) && ius.a(Boolean.valueOf(shareTarget.k), Boolean.valueOf(shareTarget2.k));
        }
        return true;
    }

    public final void a(int i2) {
        if (!this.J && !this.e) {
            if (ayni.s()) {
                i();
            }
            this.b.a((vtx) this, this.h, i2);
            uhi uhi = this.I;
            uhi.c = true;
            uhi.a();
            this.J = true;
            jjg jjg = vvj.a;
        }
    }

    public final void a(int i2, String str, ShareTarget shareTarget) {
        if (ayni.f()) {
            this.C.setVisibility(4);
            this.D.setVisibility(4);
            this.E.setVisibility(4);
            this.F.setVisibility(4);
            this.G.setVisibility(4);
            this.H.setVisibility(4);
            this.j.setVisibility(4);
        } else {
            this.C.setVisibility(8);
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.H.setVisibility(8);
            this.j.setVisibility(8);
        }
        switch (i2) {
            case 1:
            case 3:
            case 5:
            case 12:
                this.F.setVisibility(0);
                return;
            case 2:
                if (str != null) {
                    this.D.setVisibility(0);
                    this.E.setVisibility(0);
                    return;
                }
                this.F.setVisibility(0);
                return;
            case 4:
            case 7:
            case 9:
            case 10:
                this.C.setVisibility(0);
                if (shareTarget != null && shareTarget.k && !shareTarget.n && !this.p) {
                    this.H.setVisibility(0);
                    return;
                }
                return;
            case 6:
                this.G.setVisibility(0);
                this.a.postDelayed(new vrj(this), 2000);
                return;
            case 8:
            case 11:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                this.C.setVisibility(0);
                return;
            default:
                if (this.u != 4) {
                    this.C.setVisibility(0);
                    return;
                } else {
                    this.j.setVisibility(0);
                    return;
                }
        }
    }

    public final void a(View view, ShareTarget shareTarget) {
        int b;
        if (g(shareTarget).b(shareTarget).a == 0) {
            if (!(view == this.q || (b = g(shareTarget).b((Object) shareTarget)) == -1)) {
                View findViewById = view.findViewById(R.id.profile_image);
                TextView textView = (TextView) view.findViewById(R.id.title);
                View findViewById2 = this.q.findViewById(R.id.profile_image);
                View findViewById3 = this.q.findViewById(R.id.progress_bar);
                TextView textView2 = (TextView) this.q.findViewById(R.id.title);
                View findViewById4 = this.q.findViewById(R.id.header);
                g(shareTarget).a(j(shareTarget), b);
                j(shareTarget).a.setOnClickListener((View.OnClickListener) null);
                vvf vvf = new vvf(this.d);
                vvf.e = vvf.a.getLeft();
                vvf.f = vvf.a.getTop();
                vvf.g = vvf.a.getRight();
                vvf.h = vvf.a.getBottom();
                vvf.i = vvf.a.getMeasuredHeight();
                this.d.setMinimumHeight((int) getResources().getDimension(R.dimen.sharing_receiver_surface_content_min_height));
                wil.a((View) vvf.a);
                vvf.j = vvf.a.getMeasuredHeight();
                vvf.d = 300;
                vvf.start();
                float width = ((float) findViewById.getWidth()) / ((float) findViewById2.getWidth());
                float textSize = textView.getTextSize();
                float textSize2 = textView2.getTextSize();
                wil.a(findViewById3, width);
                wil.a(findViewById2, width);
                wil.a((View) textView2, textSize / textSize2);
                wil.a(findViewById, findViewById2);
                findViewById3.setTranslationX(findViewById2.getTranslationX());
                findViewById3.setTranslationY(findViewById2.getTranslationY());
                wil.a((View) textView, (View) textView2);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(4.0f);
                float translationX = findViewById2.getTranslationX();
                float translationX2 = textView2.getTranslationX();
                findViewById2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setUpdateListener(new vrq(findViewById2, translationX, decelerateInterpolator, findViewById3)).setDuration(300);
                textView2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setUpdateListener(new vrr(textView2, translationX2, decelerateInterpolator)).setDuration(300);
                this.q.setVisibility(0);
                view.findViewById(R.id.root).setVisibility(4);
                for (int i2 = 0; i2 < f(shareTarget).getChildCount(); i2++) {
                    f(shareTarget).getChildAt(i2).setEnabled(false);
                }
                this.k.animate().alpha(0.0f).setDuration(300).withEndAction(new vrs(this, shareTarget));
                findViewById4.setAlpha(0.0f);
                findViewById4.animate().alpha(1.0f).setDuration(300).withEndAction(new vrt(this, shareTarget));
                l();
            }
            c(shareTarget);
        }
    }

    public final void a(ShareTarget shareTarget) {
        if (g(shareTarget).a() == 0) {
            i(shareTarget).animate().alpha(0.0f).setDuration(150).setInterpolator(new LinearInterpolator()).start();
            f(shareTarget).animate().alpha(1.0f).setDuration(150).setStartDelay(150).withStartAction(new vrg(this, shareTarget)).start();
        }
        g(shareTarget).a((Object) shareTarget);
        if (w.isEnabled()) {
            String str = shareTarget.b;
            if (shareTarget.j != null) {
                String valueOf = String.valueOf(str);
                String str2 = shareTarget.j;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str2);
                str = sb.toString();
            }
            f(shareTarget).announceForAccessibility(str);
        }
    }

    public final void a(ShareTarget shareTarget, int i2) {
        int b;
        if (this.u == 1 && i2 == 2 && (b = g(shareTarget).b((Object) shareTarget)) != -1) {
            View childAt = f(shareTarget).getChildAt(b);
            if (childAt == null) {
                this.a.post(new vro(this, shareTarget));
            } else {
                a(childAt, shareTarget);
            }
        }
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (ayni.o() && transferMetadata.a == 15) {
            finish();
        } else if ((shareTarget.equals(this.m) && shareTarget.b().equals(this.m.b())) || !transferMetadata.e) {
            c(shareTarget, transferMetadata);
        }
    }

    public final void a(String str) {
        Toast.makeText(this, getString(R.string.sharing_enable_failed, new Object[]{str}), 0).show();
    }
}
