package com.google.android.gms.googlehelp.contact.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChatConversationChimeraActivity extends bjs implements nzc, ohv, nzu {
    private View A;
    private View B;
    private final aoru C = jfm.a(9);
    private nzx D = new nzx();
    public ViewStub a;
    public View b;
    public TextView c;
    public ViewStub d;
    public View e;
    public EditText f;
    public ImageButton g;
    public RecyclerView h;
    public ods i;
    public String j;
    public long k = -1;
    public boolean l = true;
    public boolean m = false;
    public boolean n = false;
    public long o = 0;
    public HelpConfig p;
    public okc q;
    public myp r;
    public nze s;
    BroadcastReceiver t;
    public iwq u;
    public olg v = olg.NO_TEXT_ENTERED;
    public long w = 0;
    public Handler x;
    public Runnable y;
    private View z;

    private final void C() {
        BroadcastReceiver broadcastReceiver = this.t;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.t = null;
        }
    }

    private final boolean D() {
        View view = this.B;
        return view != null && view.getVisibility() == 0;
    }

    public static Intent a(Context context, HelpConfig helpConfig) {
        Intent addFlags = new Intent().setClassName(context, "com.google.android.gms.googlehelp.contact.chat.ChatConversationActivity").putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_START_TICK", System.nanoTime()).addFlags(67108864);
        int i2 = Build.VERSION.SDK_INT;
        addFlags.addFlags(524288);
        return addFlags;
    }

    private final void d(int i2) {
        this.z.setVisibility(i2);
        this.A.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        View view = this.b;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean B() {
        return a((CharSequence) this.f.getText());
    }

    public final void b(int i2) {
        oay.a(this.z, i2);
    }

    public final void c(int i2) {
        okg.a((Context) this, this.p, this.q, i2);
    }

    public final HelpConfig f() {
        return this.p;
    }

    public final okc h() {
        return this.q;
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    public final Context k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        okg.a((nzu) this, 66, odu.a((Context) this, this.p));
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        ChatRequestAndConversationChimeraService.c(this, this.p);
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        return this.k != -1 && !this.m;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        this.x.removeCallbacks(this.y);
        this.v = olg.NO_TEXT_ENTERED;
        p();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            return;
        }
        if (i3 == 1) {
            a(true);
            m();
            finish();
        } else if (i3 != 2) {
            okg.b((nzu) this, 36, avmt.CHAT);
        } else {
            a(false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Map map;
        super.onCreate(bundle);
        HelpConfig a2 = HelpConfig.a(this, bundle, getIntent());
        if (a2 != null) {
            if (ofq.a(axqt.b()) && ((map = a2.M) == null || map.isEmpty())) {
                a2.M = nzq.a(this, a2);
            }
            this.p = a2;
            this.q = new okc(this);
            this.r = new myp();
            this.x = new qvr(Looper.getMainLooper());
            this.y = new odd(this);
            boolean a3 = ofy.a();
            int i2 = R.style.gh_ChatConversationDarkActivityStyle;
            if (a3) {
                ofy.a((Activity) this, a2, (int) R.style.gh_ChatConversationLightActivityStyle, (int) R.style.gh_ChatConversationDarkActivityStyle, (int) R.style.gh_ChatConversationDayNightActivityStyle);
            } else {
                if (!ofy.a(a2)) {
                    i2 = R.style.gh_ChatConversationLightActivityStyle;
                }
                setTheme(i2);
            }
            setContentView((int) R.layout.gh_chat_activity);
            a((Toolbar) findViewById(R.id.gh_chat_toolbar));
            nzf.a(this, false);
            this.z = findViewById(R.id.gh_chat_activity_progress_bar);
            this.A = findViewById(R.id.gh_chat_activity_progress_bar_text);
            this.d = (ViewStub) findViewById(R.id.gh_chat_conversation_stub);
            this.a = (ViewStub) findViewById(R.id.gh_chat_queue_status_stub);
            nze.a(this.C, this, this, this.p);
            this.u = iwq.a((Context) this);
            if (bundle != null) {
                if (ofq.b(axpv.b())) {
                    this.j = bundle.getString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT");
                }
                if (bundle.getBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", false)) {
                    y();
                    t();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("No HelpConfig provided!");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gh_chat_activity_menu, menu);
        ofx.a(menu.findItem(R.id.gh_chat_activity_menu_share_transcript), (Context) this, ofy.a(this, R.attr.ghf_greyIconColor));
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        if (n()) {
            l();
        } else if (this.v != olg.NO_TEXT_ENTERED) {
            o();
        }
        okc okc = this.q;
        if (okc != null) {
            okc.close();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (n() || D()) {
                c(24);
                v();
            } else {
                ohu a2 = ohw.a();
                a2.b = R.string.gh_end_chat_confirmation_message;
                a2.c = R.string.gh_end_chat_action_text;
                a2.d = R.string.common_cancel;
                a2.a().show(getSupportFragmentManager(), "end_chat_dialog");
            }
            return true;
        } else if (itemId != R.id.gh_chat_activity_menu_share_transcript) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            CharSequence a3 = ChatRequestAndConversationChimeraService.a(getPackageManager(), this.p);
            if (TextUtils.isEmpty(a3)) {
                str = getString(R.string.gh_chat_google_support);
            } else {
                str = getString(R.string.gh_hangout_product_specific_subtext, new Object[]{a3});
            }
            String string = getString(R.string.gh_chat_shared_transcript_email_subject, new Object[]{str});
            ju a4 = ju.a(getContainerActivity());
            a4.b("text/plain");
            ods ods = this.i;
            long j2 = this.o;
            ArrayList arrayList = new ArrayList(1);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String str2 = "";
            for (int i2 = 0; i2 < ods.e.size(); i2++) {
                oky oky = (oky) ods.e.get(i2);
                if (!TextUtils.equals(ods.m, oky.b) && !arrayList.contains(oky.b)) {
                    arrayList.add(oky.b);
                    sb.append(String.format("%s%s", new Object[]{str2, oky.d}));
                    str2 = ", ";
                }
                if (i2 != 0 && !((Boolean) ods.h.get(i2 - 1)).booleanValue()) {
                    sb2.append(String.format("%s\n", new Object[]{oky.c}));
                } else {
                    sb2.append(String.format("\n%s [%s]:\n%s\n", new Object[]{oky.d, ods.g.get(i2), oky.c}));
                }
            }
            Pair create = Pair.create(sb.toString(), sb2.toString());
            String str3 = (String) create.first;
            String str4 = (String) create.second;
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append("\n---\n");
            long j3 = ods.i;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j3 + j2);
            sb3.append(String.format("%s: %s\n", new Object[]{getString(R.string.gh_chat_shared_transcript_header_time_of_chat), DateUtils.formatDateTime(this, instance.getTimeInMillis(), 21)}));
            sb3.append(String.format("%s: %s\n", new Object[]{getString(R.string.gh_chat_shared_transcript_header_chat_duration), DateUtils.formatElapsedTime((ods.j - ods.i) / 1000)}));
            if (!TextUtils.isEmpty(str3)) {
                sb3.append(String.format("%s: %s\n", new Object[]{getString(R.string.gh_chat_shared_transcript_header_chatted_with), str3}));
            }
            sb3.append("---\n");
            sb3.append(str4);
            a4.a((CharSequence) sb3.toString());
            a4.a(string);
            Intent a5 = a4.a();
            if (!jhg.a((Context) this, a5)) {
                return true;
            }
            startActivity(Intent.createChooser(a5, getString(R.string.gh_chat_share_transcript)));
            return true;
        }
    }

    public final void onPause() {
        odu.a(odu.a((Context) this, this.p) + this.r.a(), (Context) this, this.p);
        ChatRequestAndConversationChimeraService.a(false, (Context) this, this.p);
        C();
        ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, this.p);
        super.onPause();
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        ods ods;
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.gh_chat_activity_menu_share_transcript);
        ju a2 = ju.a(getContainerActivity());
        a2.b("text/plain");
        a2.a((CharSequence) "");
        a2.a("");
        Intent a3 = a2.a();
        boolean z2 = false;
        if (n() && (ods = this.i) != null && ods.k > 0 && jhg.a((Context) this, a3)) {
            z2 = true;
        }
        findItem.setVisible(z2);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        EditText editText;
        bundle.putParcelable("EXTRA_HELP_CONFIG", this.p);
        if (ofq.b(axpv.b()) && (editText = this.f) != null) {
            bundle.putString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT", editText.getText().toString());
        }
        if (D()) {
            bundle.putBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void p() {
        ChatRequestAndConversationChimeraService.a(this.v, (Context) this, this.p);
    }

    public final void q() {
        this.h.scrollToPosition(this.i.k - 1);
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        a((nzc) new odg(this));
    }

    public final oah s() {
        return new oah(this);
    }

    public final void startActivity(Intent intent) {
        if (!(intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null)) {
            if (!opa.a((Activity) this, intent, this.p, 2)) {
                if (s().a(intent.getData(), 1)) {
                    return;
                }
            } else {
                return;
            }
        }
        super.startActivity(intent);
    }

    public final void t() {
        View view;
        View view2 = this.B;
        if (view2 == null) {
            View inflate = ((ViewStub) findViewById(R.id.gh_chat_request_error_stub)).inflate();
            this.B = inflate;
            oay.a(inflate, (int) R.string.gh_chat_request_failed, (View.OnClickListener) new odb(this));
        } else {
            view2.setVisibility(0);
        }
        if (ofq.b(axqn.a.a().b()) && (view = this.b) != null) {
            view.setVisibility(8);
        }
        b((int) R.string.gh_chat_request_failed);
    }

    public final void u() {
        a((nzc) new odh());
    }

    public final void v() {
        w();
        finish();
    }

    public final void w() {
        a((nzc) new odi());
        C();
        u();
        this.u.a(2014);
    }

    /* access modifiers changed from: package-private */
    public final void x() {
        AppBarLayout appBarLayout;
        abk abk = new abk();
        abk.a((String) null);
        if (!abk.l) {
            abk.l = true;
            abk.o();
        }
        this.h.setLayoutManager(abk);
        ods ods = new ods(this);
        this.i = ods;
        this.h.setAdapter(ods);
        if (jkr.a() && (appBarLayout = (AppBarLayout) findViewById(R.id.gh_chat_app_bar)) != null) {
            this.h.addOnScrollListener(new odj(this, abk, getResources().getDimensionPixelSize(R.dimen.gh_chat_transcript_padding_top), appBarLayout));
        }
        View findViewById = findViewById(R.id.gh_chat_send_message_section);
        a(findViewById.getHeight());
        findViewById.addOnLayoutChangeListener(new odc(this));
    }

    public final void y() {
        View view = this.z;
        if (view != null && view.getVisibility() == 0) {
            d(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean z() {
        View view = this.e;
        return view != null && view.getVisibility() == 0;
    }

    public final void b(boolean z2) {
        int i2;
        this.g.setEnabled(z2);
        ImageButton imageButton = this.g;
        if (!z2) {
            i2 = R.attr.gh_disabledIconColor;
        } else {
            i2 = R.attr.gh_primaryBlueColor;
        }
        ofx.a((ImageView) imageButton, (Context) this, ofy.a(this, i2));
    }

    public final void c(boolean z2) {
        if (z2) {
            o();
        } else if (this.v != olg.TYPING) {
            this.x.postDelayed(this.y, axmj.g());
            this.v = olg.TYPING;
            p();
        }
    }

    public final void e() {
        if (D()) {
            this.B.setVisibility(8);
        } else if (z()) {
            this.e.setVisibility(8);
        } else if (A()) {
            this.b.setVisibility(8);
        }
        d(0);
        this.l = true;
        this.m = false;
        this.n = false;
        this.k = -1;
        odu.b((Context) this, this.p);
        odu.d(this, this.p);
        this.r.c();
        invalidateOptionsMenu();
    }

    public final void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
        if (this.t == null) {
            this.t = new nla("googlehelp") {
                public final void a(Context context, Intent intent) {
                    ods ods;
                    int i;
                    String str;
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity = ChatConversationChimeraActivity.this;
                        olg olg = (olg) amri.c(olg.a(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).a((Object) olg.UNKNOWN_TYPING_STATUS);
                        if (chatConversationChimeraActivity.i.a(olg, intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID"), intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1)) && olg == olg.TYPING) {
                            chatConversationChimeraActivity.b((int) R.string.gh_chat_typing_indicator_active_announcement);
                        }
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT")) {
                        ChatConversationChimeraActivity.this.r();
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity2 = ChatConversationChimeraActivity.this;
                        ods ods2 = chatConversationChimeraActivity2.i;
                        long longExtra = intent.getLongExtra("EXTRA_MESSAGE_CLIENT_TIME", -1);
                        int a2 = ods2.a(longExtra);
                        if (a2 < 0) {
                            StringBuilder sb = new StringBuilder(107);
                            sb.append("No pending messages found for the given client time ");
                            sb.append(longExtra);
                            sb.append("; this means the list is corrupted.");
                            Log.w("gH_ChatConvoLytAdapter", sb.toString());
                        } else {
                            okz okz = (okz) ods2.f.get(a2);
                            aucd aucd = (aucd) okz.c(5);
                            aucd.a((aucj) okz);
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            okz okz2 = (okz) aucd.b;
                            okz okz3 = okz.e;
                            okz2.a |= 4;
                            okz2.d = false;
                            ods2.f.set(a2, (okz) aucd.i());
                            ods2.K(ods2.g(a2));
                        }
                        chatConversationChimeraActivity2.b((int) R.string.gh_message_failed_to_send_announcement);
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity3 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity3.o = intent.getLongExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", 0);
                        chatConversationChimeraActivity3.n = true;
                        if (intent.getBooleanExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity4 = ChatConversationChimeraActivity.this;
                            if (!chatConversationChimeraActivity4.l && (ods = chatConversationChimeraActivity4.i) != null) {
                                List b = odu.b(chatConversationChimeraActivity4.s);
                                long j = chatConversationChimeraActivity4.o;
                                if (b != null) {
                                    i = b.size();
                                } else {
                                    i = 0;
                                }
                                int size = ods.g.size();
                                ArrayList arrayList = new ArrayList(size);
                                int i2 = 0;
                                for (int i3 = 0; i3 < i; i3++) {
                                    if (((oko) b.get(i3)).b == 3) {
                                        aufd aufd = ((oko) b.get(i3)).e;
                                        if (aufd == null) {
                                            aufd = aufd.b;
                                        }
                                        arrayList.add(ods.a(aufd.a, j));
                                        i2++;
                                    }
                                }
                                if (i2 == size) {
                                    ods.g = arrayList;
                                    ods.as();
                                }
                            }
                        }
                    } else if (intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity5 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity5.a(chatConversationChimeraActivity5.r.a());
                        chatConversationChimeraActivity5.l = false;
                        chatConversationChimeraActivity5.y();
                        if (chatConversationChimeraActivity5.A()) {
                            chatConversationChimeraActivity5.b.setVisibility(8);
                        }
                        View view = chatConversationChimeraActivity5.e;
                        if (view == null) {
                            chatConversationChimeraActivity5.e = chatConversationChimeraActivity5.d.inflate();
                            chatConversationChimeraActivity5.f = (EditText) chatConversationChimeraActivity5.e.findViewById(R.id.gh_chat_message_input);
                            chatConversationChimeraActivity5.f.addTextChangedListener(new ode(chatConversationChimeraActivity5));
                            if (ofq.b(axpv.b()) && (str = chatConversationChimeraActivity5.j) != null) {
                                chatConversationChimeraActivity5.f.setText(str);
                                chatConversationChimeraActivity5.f.requestFocus();
                            }
                            chatConversationChimeraActivity5.g = (ImageButton) chatConversationChimeraActivity5.e.findViewById(R.id.gh_chat_send_message_button);
                            chatConversationChimeraActivity5.g.setOnClickListener(new odf(chatConversationChimeraActivity5));
                            chatConversationChimeraActivity5.h = (RecyclerView) chatConversationChimeraActivity5.e.findViewById(R.id.gh_chat_transcript);
                            chatConversationChimeraActivity5.x();
                        } else if (view.getVisibility() != 0) {
                            chatConversationChimeraActivity5.e.setVisibility(0);
                            chatConversationChimeraActivity5.x();
                            chatConversationChimeraActivity5.findViewById(R.id.gh_chat_send_message_section).setVisibility(0);
                        }
                        chatConversationChimeraActivity5.r();
                    } else if (!intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE")) {
                    } else {
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity6 = ChatConversationChimeraActivity.this;
                            int intExtra = intent.getIntExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", -1);
                            if (intExtra > 0) {
                                chatConversationChimeraActivity6.l = true;
                                chatConversationChimeraActivity6.y();
                                if (chatConversationChimeraActivity6.z()) {
                                    chatConversationChimeraActivity6.e.setVisibility(8);
                                }
                                View view2 = chatConversationChimeraActivity6.b;
                                if (view2 == null) {
                                    chatConversationChimeraActivity6.b = chatConversationChimeraActivity6.a.inflate();
                                    if (chatConversationChimeraActivity6.c == null) {
                                        chatConversationChimeraActivity6.c = (TextView) chatConversationChimeraActivity6.b.findViewById(R.id.gh_chat_queue_position);
                                    }
                                    ofx.a((ImageView) chatConversationChimeraActivity6.b.findViewById(R.id.gh_chat_queue_icon), (Context) chatConversationChimeraActivity6, ofy.a(chatConversationChimeraActivity6, R.attr.gh_primaryBlueColor));
                                } else if (view2.getVisibility() != 0) {
                                    chatConversationChimeraActivity6.b.setVisibility(0);
                                }
                                String string = chatConversationChimeraActivity6.getString(R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(intExtra)});
                                chatConversationChimeraActivity6.c.setText(string);
                                chatConversationChimeraActivity6.a(string);
                                chatConversationChimeraActivity6.b((int) R.string.gh_chat_queue_subtext);
                            }
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity7 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity7.y();
                            chatConversationChimeraActivity7.u();
                            ChatRequestAndConversationChimeraService.e(chatConversationChimeraActivity7, chatConversationChimeraActivity7.p);
                            chatConversationChimeraActivity7.u.a(2014);
                            chatConversationChimeraActivity7.t();
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_DATA_STALE", false)) {
                            ChatConversationChimeraActivity.this.u();
                        } else if (intent.getBooleanExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity8 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity8.m();
                            chatConversationChimeraActivity8.v();
                        } else if (!intent.getBooleanExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", false)) {
                            intent.getBooleanExtra("EXTRA_NO_PENDING_CHAT_REQUEST", false);
                        } else {
                            ChatConversationChimeraActivity.this.w();
                        }
                    }
                }
            };
        }
        registerReceiver(this.t, intentFilter, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", (Handler) null);
        ChatRequestAndConversationChimeraService.b(this, this.p);
        ChatRequestAndConversationChimeraService.a(true, (Context) this, this.p);
        ChatRequestAndConversationChimeraService.a((Context) this, this.n, this.p);
        if (this.m) {
            ChatRequestAndConversationChimeraService.d(this, this.p);
        }
        ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, this.p.b);
        this.r.c();
    }

    public final void onStart() {
        super.onStart();
        if (nzq.b(this, this.p, "user_is_requesting_new_chat")) {
            if (z()) {
                l();
            } else if (A()) {
                a(0);
            }
            e();
            odu.i(this, this.p);
        }
    }

    public static boolean a(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence) == 0;
    }

    public final void a(int i2) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gh_chat_transcript_padding_horizontal);
        this.h.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.gh_chat_transcript_padding_top), dimensionPixelSize, i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (!nzq.b(this, this.p, "has_reported_chat_view_time_while_in_queue")) {
            okg.a((nzu) this, 65, odu.a((Context) this, this.p) + j2);
            odu.c(this, this.p);
            odu.b((Context) this, this.p);
            this.r.c();
        }
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            long j2 = bundle.getLong("EXTRA_MESSAGE_CLIENT_TIME");
            if (j2 != 0) {
                ods ods = this.i;
                int a2 = ods.a(j2);
                if (a2 >= 0) {
                    ods.f.remove(a2);
                    ods.k--;
                    ods.M(ods.g(a2));
                    ods.o.b((int) R.string.gh_message_deleted_announcement);
                    return;
                }
                return;
            }
        }
        m();
        if (this.l) {
            long a3 = this.r.a();
            if (a3 >= axmj.a.a().ac()) {
                okg.n(this);
                a(a3);
            }
        } else {
            this.m = false;
            c(50);
        }
        v();
    }

    public final void a(String str) {
        this.z.announceForAccessibility(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(nzc nzc) {
        nze nze = this.s;
        if (nze == null) {
            nzx nzx = this.D;
            if (nzx != null) {
                nzx.addObserver(new oda(this, nzc));
                return;
            }
            return;
        }
        nzc.a(nze);
    }

    public final void a(nze nze) {
        nzx nzx = this.D;
        if (nzx != null) {
            this.s = nze;
            nzx.a();
            this.D = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        int i2;
        if (!z2) {
            i2 = 22;
        } else {
            i2 = 21;
        }
        okg.a((nzu) this, 35, i2, avmt.CHAT);
    }
}
