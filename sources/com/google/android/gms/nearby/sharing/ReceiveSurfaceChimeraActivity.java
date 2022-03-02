package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.view.LoadingButton;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReceiveSurfaceChimeraActivity extends vhg implements vtx, vul {
    private View A;
    private vuq B;
    private vva C;
    private View D;
    private vup E;
    private View F;
    private boolean G = false;
    private vna H;
    private boolean I = false;
    public View h;
    public TextView i;
    public LoadingButton j;
    public TextView k;
    public ShareTarget l;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    private final BroadcastReceiver p = new nla("nearby") {
        public final void a(Context context, Intent intent) {
            if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
                ReceiveSurfaceChimeraActivity.this.h();
            }
        }
    };
    private final BroadcastReceiver q = new nla("nearby") {
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                java.lang.String r6 = r7.getAction()
                if (r6 == 0) goto L_0x009d
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
                if (r6 == 0) goto L_0x0098
                if (r6 == r3) goto L_0x0082
                if (r6 == r2) goto L_0x0047
                goto L_0x0091
            L_0x0047:
                java.lang.String r6 = "wifi_state"
                int r6 = r7.getIntExtra(r6, r4)
                r7 = 3
                if (r6 != r7) goto L_0x0057
                com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity r6 = com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.this
                r6.h()
                return
            L_0x0057:
                if (r6 != r3) goto L_0x0091
                ayni r6 = defpackage.ayni.a
                aynj r6 = r6.a()
                boolean r6 = r6.C()
                if (r6 != 0) goto L_0x006b
                com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity r6 = com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.this
                r6.h()
                return
            L_0x006b:
                com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity r6 = com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.this
                android.os.Handler r6 = r6.a
                vow r7 = new vow
                r7.<init>(r5)
                ayni r0 = defpackage.ayni.a
                aynj r0 = r0.a()
                long r0 = r0.al()
                r6.postDelayed(r7, r0)
                return
            L_0x0082:
                java.lang.String r6 = "android.bluetooth.adapter.extra.STATE"
                int r6 = r7.getIntExtra(r6, r4)
                r7 = 12
                if (r6 != r7) goto L_0x008d
                goto L_0x0092
            L_0x008d:
                r7 = 10
                if (r6 == r7) goto L_0x0092
            L_0x0091:
                return
            L_0x0092:
                com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity r6 = com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.this
                r6.h()
                return
            L_0x0098:
                com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity r6 = com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.this
                r6.h()
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity.AnonymousClass2.a(android.content.Context, android.content.Intent):void");
        }
    };
    private View r;
    private Button s;
    private Button t;
    private Button u;
    private Button v;
    private Button w;
    private vws x;
    private View y;
    private View z;

    private final void a(int i2) {
        CharSequence charSequence;
        String str;
        if (this.i.getTag(R.id.toolbar_title) != null) {
            charSequence = (CharSequence) this.i.getTag(R.id.toolbar_title);
        } else {
            charSequence = this.i.getText();
        }
        switch (i2) {
            case 1:
                str = getString(R.string.sharing_status_connecting);
                break;
            case 2:
                str = getString(R.string.sharing_status_waiting_receiver, new Object[]{wih.a(this.l.b, 16)});
                break;
            case 3:
            case 5:
                str = getString(R.string.sharing_status_receiving);
                break;
            case 4:
            case 7:
                str = getString(R.string.sharing_status_failed);
                break;
            case 6:
                str = getString(R.string.sharing_status_received);
                break;
            case 8:
                str = getString(R.string.sharing_status_rejected);
                break;
            case 9:
                str = getString(R.string.sharing_status_cancelled);
                break;
            case 10:
                str = getString(R.string.sharing_status_timed_out);
                break;
            case 11:
                str = getString(R.string.sharing_status_media_unavailable);
                break;
            case 12:
                str = getString(R.string.sharing_status_media_downloading);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                str = getString(R.string.sharing_status_not_enough_space);
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                str = getString(R.string.sharing_status_unsupported_attachment_type);
                break;
            default:
                str = getString(R.string.sharing_product_name);
                break;
        }
        if (TextUtils.equals(charSequence, str)) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.i.setText(str);
            invalidateOptionsMenu();
            return;
        }
        this.i.setTag(R.id.toolbar_title, str);
        this.h.animate().alpha(0.0f).setDuration(250).withEndAction(new voj(this));
    }

    private final void b(int i2) {
        if (ayni.f()) {
            this.s.setVisibility(4);
            this.t.setVisibility(4);
            this.u.setVisibility(4);
            this.v.setVisibility(4);
            this.w.setVisibility(4);
            this.j.setVisibility(4);
        } else {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.j.setVisibility(8);
        }
        switch (i2) {
            case 1:
            case 3:
            case 5:
                this.v.setVisibility(0);
                return;
            case 2:
                this.t.setVisibility(0);
                this.u.setVisibility(0);
                return;
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                this.w.setVisibility(0);
                return;
            case 6:
                List list = this.l.f;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        if (((TextAttachment) list.get(i3)).b == 0) {
                            i3 = i4;
                        }
                    }
                    this.o = true;
                    List list2 = this.l.f;
                    if (!list2.isEmpty()) {
                        TextView textView = (TextView) this.F.findViewById(R.id.sender_info);
                        textView.setText(getString(R.string.sharing_receive_surface_received_sender_description, new Object[]{this.l.b}));
                        ShareTarget shareTarget = this.l;
                        textView.setCompoundDrawablesWithIntrinsicBounds(new vwp(this, new vwo(shareTarget.b, shareTarget.c, shareTarget.k), 24), (Drawable) null, (Drawable) null, (Drawable) null);
                        ((TextView) this.F.findViewById(R.id.text_content)).setText(((TextAttachment) list2.get(0)).a);
                        ((TextView) this.F.findViewById(R.id.copy_btn)).setOnClickListener(new vok(this));
                        this.F.setVisibility(0);
                        this.D.setVisibility(8);
                        this.z.setVisibility(8);
                        return;
                    }
                    return;
                }
                a(this.l);
                return;
            default:
                if (this.G) {
                    this.s.setVisibility(0);
                    return;
                } else {
                    this.j.setVisibility(0);
                    return;
                }
        }
    }

    private final void l() {
        if (!this.n && !this.o) {
            a(0);
            if (!this.G) {
                this.y.setVisibility(0);
                this.D.setVisibility(8);
                this.z.setVisibility(8);
                this.A.setVisibility(8);
                this.r.setVisibility(0);
                b(0);
            } else if (this.B.e.isEmpty()) {
                this.y.setVisibility(8);
                this.D.setVisibility(8);
                this.z.setVisibility(0);
                this.A.setVisibility(0);
                this.r.setVisibility(8);
            } else {
                this.y.setVisibility(8);
                this.D.setVisibility(0);
                this.z.setVisibility(8);
                this.A.setVisibility(8);
                this.r.setVisibility(0);
                b(0);
            }
        }
    }

    private final void m() {
        this.b.a((vtx) this);
        vws vws = this.x;
        vws.b.a();
        vws.c.a();
        vws.invalidateSelf();
        vws.d = false;
        l();
    }

    public final void a(View view, Object obj) {
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity"}));
        List list = this.B.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ShareTarget shareTarget = (ShareTarget) list.get(i2);
            printWriter.write(String.format("  %s\n", new Object[]{shareTarget}));
            printWriter.write(String.format("  %s\n", new Object[]{this.B.b(shareTarget)}));
        }
        printWriter.flush();
    }

    public final void h() {
        this.b.p().a((acvv) new voh(this, wia.a((Context) this), wht.a(), win.a((Context) this)));
    }

    public final void i() {
        if (!this.G && !this.e) {
            this.G = true;
            this.b.a(this, 1);
            vws vws = this.x;
            int a = wid.a(this);
            vws.b.b.setColor(a);
            vws.c.b.setColor(a);
            vws.a.b.setColor(a);
            vws vws2 = this.x;
            vws2.b.a(800);
            vws2.c.a(1300);
            vws2.d = true;
            l();
            this.b.s().a((acvv) new voi(this));
            ((anih) vvj.a.d()).a("ReceiveSurfaceActivity is now available");
        }
    }

    public final void j() {
        if (this.G) {
            this.G = false;
            if (!ayni.c() || !this.n) {
                m();
                ((anih) vvj.a.d()).a("ReceiveSurfaceActivity is unavailable");
            }
        }
    }

    public final void k() {
        tcn.c(this).t().a((acvv) new vol(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1000) {
            if (i2 != 1005) {
                if (i2 != 1006) {
                    super.onActivityResult(i2, i3, intent);
                } else {
                    h();
                }
            } else if (i3 == -1) {
                h();
            } else if (ayni.O()) {
                Toast.makeText(this, getString(R.string.sharing_enable_failed_location), 0).show();
            } else {
                a(getString(R.string.sharing_required_service_location));
            }
        } else if (i3 != -1) {
            finish();
        } else {
            h();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ayni.p()) {
            this.m = true;
            finish();
            return;
        }
        this.C = new vva();
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("is_from_fast_init", false)) {
            vva vva = this.C;
            aucd d = vvb.d(28);
            asla asla = asla.a;
            if (d.c) {
                d.c();
                d.c = false;
            }
            asmc asmc = (asmc) d.b;
            asmc asmc2 = asmc.B;
            asla.getClass();
            asmc.y = asla;
            asmc.a |= 536870912;
            vva.a(new vut((asmc) d.i()));
        }
        sv.o();
        setContentView((int) R.layout.sharing_activity_receive_surface);
        this.H = vna.a((Context) this);
        View findViewById = findViewById(R.id.toolbar_wrapper);
        this.h = findViewById;
        a((Toolbar) findViewById.findViewById(R.id.toolbar));
        aE().c(false);
        this.i = (TextView) this.h.findViewById(R.id.toolbar_title);
        a(0);
        this.r = findViewById(R.id.nav_bar);
        this.s = (Button) findViewById(R.id.stop_btn);
        this.t = (Button) findViewById(R.id.accept_btn);
        this.u = (Button) findViewById(R.id.reject_btn);
        this.v = (Button) findViewById(R.id.cancel_btn);
        this.w = (Button) findViewById(R.id.close_btn);
        this.j = (LoadingButton) findViewById(R.id.enable_btn);
        this.s.setOnClickListener(new vob(this));
        this.t.setOnClickListener(new vom(this));
        this.u.setOnClickListener(new voo(this));
        this.v.setOnClickListener(new vop(this));
        this.w.setOnClickListener(new voq(this));
        this.j.setOnClickListener(new vor(this));
        b(0);
        if (ayni.P()) {
            this.y = findViewById(R.id.missing_permissions_103);
        } else {
            this.y = findViewById(R.id.missing_permissions);
        }
        this.y.setVisibility(8);
        this.x = new vws(this);
        ((ImageView) findViewById(R.id.advertising_indicator)).setImageDrawable(this.x);
        View findViewById2 = findViewById(R.id.empty_view);
        this.z = findViewById2;
        this.k = (TextView) findViewById2.findViewById(R.id.header_subtitle);
        TextView textView = (TextView) findViewById(R.id.debug_text);
        if (ayni.J()) {
            textView.setText(why.a(this));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.A = findViewById(R.id.help_section);
        if (!ayni.y()) {
            TextView textView2 = (TextView) findViewById(R.id.help_link_text_old);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new vot(this));
        } else {
            TextView textView3 = (TextView) findViewById(R.id.help_link_text);
            String valueOf = String.valueOf(textView3.getText());
            String string = getString(R.string.sharing_receive_surface_learn_more);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string);
            String sb2 = sb.toString();
            int length = textView3.getText().length();
            int length2 = sb2.length();
            textView3.setText(sb2);
            wil.a(textView3, length + 1, length2, (View.OnClickListener) new vou(this));
        }
        this.D = findViewById(R.id.enlarged_view);
        vuq a = vuq.a((Context) this, (vul) this);
        this.B = a;
        this.E = a.a(this.D);
        this.F = findViewById(R.id.text_content_preview);
        ((anih) vvj.a.d()).a("ReceiveSurfaceActivity created");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharing_menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        } else if (menuItem.getItemId() == R.id.action_settings) {
            startActivity(SettingsChimeraActivity.a((Context) this));
            ((anih) vvj.a.d()).a("Launched the settings activity");
            return true;
        } else if (menuItem.getItemId() != R.id.action_feedback) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            tcn.c(this).t().a((acvv) new voc(this));
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
        this.b.t().a((acvv) new vov(this, findItem));
        findItem.setVisible(this.l == null);
        aE().b(this.l == null);
        menu.findItem(R.id.action_feedback).setVisible(ayni.K());
        int i2 = 0;
        for (int i3 = 0; i3 < menu.size(); i3++) {
            if (menu.getItem(i3).isVisible()) {
                i2++;
            }
        }
        int max = Math.max(1, i2) * wid.a(this, 48);
        TextView textView = this.i;
        textView.setPadding(max, textView.getPaddingTop(), max, this.i.getPaddingBottom());
        wil.a((Context) this, this.i, getResources().getDimension(R.dimen.sharing_toolbar_title_text_size_default), getResources().getDimension(R.dimen.sharing_toolbar_title_text_size_min));
        CharSequence charSequence = (CharSequence) this.i.getTag(R.id.toolbar_title);
        if (!TextUtils.isEmpty(charSequence)) {
            this.i.setTag(R.id.toolbar_title, (Object) null);
            this.i.setText(charSequence);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        a((vhf) new vos(this));
        ((anih) vvj.a.d()).a("ReceiveSurfaceActivity has resumed");
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        if (!this.m) {
            super.onStart();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.location.MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            registerReceiver(this.q, intentFilter);
            thp.a(this, this.p, new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
            h();
            l();
            invalidateOptionsMenu();
            ((anih) vvj.a.d()).a("ReceiveSurfaceActivity has started");
            return;
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        if (!this.m) {
            thp.a((Context) this, this.q);
            thp.a((Context) this, this.p);
            if (!this.o) {
                this.l = null;
            }
            this.B.c();
            j();
            if (ayni.c()) {
                m();
            }
            ((anih) vvj.a.d()).a("ReceiveSurfaceActivity has stopped");
            super.onStop();
            return;
        }
        super.onStop();
    }

    public final void a(ShareTarget shareTarget) {
        this.b.c(shareTarget);
        finish();
    }

    public final void a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        if (!ayni.n() || transferMetadata.a != 15) {
            this.H.a(shareTarget);
            if (!transferMetadata.e || this.I) {
                b(shareTarget, transferMetadata);
                return;
            }
            return;
        }
        finish();
    }

    public final void b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        this.l = shareTarget;
        if (!this.B.a(shareTarget)) {
            this.B.a((Object) shareTarget);
        }
        this.B.a(shareTarget, transferMetadata);
        vuq vuq = this.B;
        vuq.a(this.E, vuq.b((Object) shareTarget));
        if (ayni.l()) {
            this.E.a.setOnClickListener((View.OnClickListener) null);
        }
        this.B.as();
        l();
        a(transferMetadata.a);
        b(transferMetadata.a);
        if (transferMetadata.e) {
            this.b.a((vtx) this);
            this.n = false;
            return;
        }
        this.n = true;
        this.I = true;
    }

    public final void a(String str) {
        Toast.makeText(this, getString(R.string.sharing_enable_failed, new Object[]{str}), 0).show();
    }
}
