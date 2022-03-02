package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: ods  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ods extends acg {
    public final ou a = new ou();
    public final List e;
    public final List f;
    public List g;
    public final List h;
    public long i;
    public long j;
    public int k = 0;
    public boolean l = false;
    public String m;
    public String n;
    public final ChatConversationChimeraActivity o;
    public long p;
    public final Handler q;
    public final Runnable r;
    private final InputFilter s;
    private olg t;
    private long u;

    public ods(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        ColorStateList colorStateList;
        long j2;
        oky oky;
        String str = "";
        this.n = str;
        this.t = olg.NO_TEXT_ENTERED;
        this.u = 0;
        this.p = 0;
        this.q = new qvr(Looper.getMainLooper());
        this.o = chatConversationChimeraActivity;
        if (ofy.b()) {
            colorStateList = ColorStateList.valueOf(ofy.a(this.o, R.attr.gh_primaryBlueColor));
        } else {
            colorStateList = chatConversationChimeraActivity.getResources().getColorStateList(R.color.gh_chat_survey_link_color_list);
        }
        this.s = new odk(this, chatConversationChimeraActivity, chatConversationChimeraActivity.getResources().getDimensionPixelSize(R.dimen.gh_chat_message_link_font_size), colorStateList);
        this.r = new odl(this);
        this.f = new ArrayList();
        ArrayList arrayList = new ArrayList(0);
        int size = arrayList.size();
        this.e = new ArrayList(size);
        this.g = new ArrayList(size);
        this.h = new ArrayList(size);
        if (size != 0) {
            aufd aufd = ((oko) arrayList.get(0)).e;
            j2 = (aufd == null ? aufd.b : aufd).a;
        } else {
            j2 = 0;
        }
        this.i = j2;
        this.j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            oko oko = (oko) arrayList.get(i2);
            if (oko.b == 3) {
                oky = (oky) oko.c;
            } else {
                oky = oky.g;
            }
            this.e.add(oky);
            List list = this.g;
            aufd aufd2 = oko.e;
            list.add(a((aufd2 == null ? aufd.b : aufd2).a, 0));
            if (i2 < size - 1) {
                this.h.add(Boolean.valueOf(!a((oko) arrayList.get(i2 + 1))));
            } else {
                this.h.add(true);
                aufd aufd3 = oko.e;
                this.j = (aufd3 == null ? aufd.b : aufd3).a;
            }
            if (!str.equals(oky.b)) {
                this.a.put(Integer.valueOf(this.k), Integer.valueOf(i2));
                this.k++;
            }
            str = oky.b;
        }
        axnx.c();
        int size2 = this.k + this.f.size() + 1;
        this.k = size2;
        c(0, size2);
    }

    public static final String a(long j2, long j3) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2 + j3);
        return new SimpleDateFormat("h:mm aa", Locale.getDefault()).format(instance.getTime());
    }

    private final boolean h(int i2) {
        return i2 == 0 || ((Boolean) this.h.get(i2 + -1)).booleanValue();
    }

    public final int a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return this.a.h;
    }

    public final int d() {
        return this.f.size();
    }

    /* access modifiers changed from: package-private */
    public final boolean f(int i2) {
        return !TextUtils.equals(((oky) this.e.get(i2)).b, this.m);
    }

    public final int g(int i2) {
        return c() + i2;
    }

    static String a(String str, String str2) {
        return String.format("%s • %s", new Object[]{str, str2});
    }

    static final oab a(avlz avlz) {
        String valueOf = String.valueOf(avlz.f);
        return oab.a(avlz, avlz.g, avlz.h, valueOf.length() == 0 ? new String("help://action/") : "help://action/".concat(valueOf));
    }

    private final void a(LayoutInflater layoutInflater, LinearLayout linearLayout, boolean z, int i2, oky oky) {
        View view;
        int i3;
        int i4;
        LayoutInflater layoutInflater2 = layoutInflater;
        LinearLayout linearLayout2 = linearLayout;
        int i5 = i2;
        oky oky2 = oky;
        if (!z) {
            view = layoutInflater2.inflate(R.layout.gh_chat_transcript_inbound_message, linearLayout2, true);
            TextView textView = (TextView) view.findViewById(R.id.gh_transcript_message_agent_initial);
            if (i5 == 2 || i5 == 4) {
                if (!TextUtils.isEmpty(oky2.d)) {
                    textView.setText(String.valueOf(oky2.d.charAt(0)));
                }
                textView.setBackground(ofa.a(ofy.a(this.o, R.attr.gh_chatAgentInitialCircleBackgroundColor)));
            } else {
                textView.setVisibility(4);
            }
        } else {
            if (!ofq.b(axqq.a.a().b())) {
                i4 = R.layout.gh_chat_transcript_outbound_message_deprecated;
            } else {
                i4 = R.layout.gh_chat_transcript_outbound_message;
            }
            view = layoutInflater2.inflate(i4, linearLayout2, true);
        }
        View findViewById = view.findViewById(R.id.gh_transcript_message_text);
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.o;
        Resources resources = chatConversationChimeraActivity.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.gh_chat_bubble_round_corner_radius);
        float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(R.dimen.gh_chat_bubble_sharp_corner_radius);
        int i6 = i5 - 1;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(i6 != 0 ? i6 != 1 ? i6 != 2 ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : z ^ oay.a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2} : z ^ oay.a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize} : z ^ oay.a(resources) ? new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize} : new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2}, (RectF) null, (float[]) null));
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.gh_chat_bubble_padding_horizontal);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.gh_chat_bubble_padding_vertical);
        shapeDrawable.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
        Paint paint = shapeDrawable.getPaint();
        if (!z) {
            i3 = R.attr.gh_chatInboundMessageBackgroundColor;
        } else {
            i3 = R.attr.gh_primaryBlueColor;
        }
        paint.setColor(ofy.a(chatConversationChimeraActivity, i3));
        findViewById.setBackground(shapeDrawable);
    }

    static final void a(View view, boolean z) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.gh_transcript_message_spacing_component);
        if (z) {
            linearLayout.setVisibility(4);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public final int a(long j2) {
        odq odq = new odq();
        aucd o2 = okz.e.o();
        aufd a2 = aufd.a(j2);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        okz okz = (okz) o2.b;
        a2.getClass();
        okz.c = a2;
        okz.a |= 2;
        return Collections.binarySearch(this.f, (okz) o2.i(), odq);
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        return new odr(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gh_chat_transcript_message_container, viewGroup, false));
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i2) {
        oky oky;
        int i3;
        int i4;
        View.OnClickListener onClickListener;
        int i5 = i2;
        odr odr = (odr) adl;
        if (i5 >= this.k) {
            Log.w("gH_ChatConvoLytAdapter", String.format("Trying to bind ViewHolder for position %d, but the position is out of bound.", new Object[]{Integer.valueOf(i2)}));
            return;
        }
        odr.s.removeAllViews();
        ViewGroup viewGroup = null;
        if (i5 == this.k - 1) {
            odr.s.addView(LayoutInflater.from(odr.s.getContext()).inflate(R.layout.gh_chat_transcript_bottom_padding, (ViewGroup) null));
            return;
        }
        axnx.c();
        if (i5 != c() + d()) {
            int c = c();
            int i6 = R.id.gh_transcript_message_item_component;
            int i7 = R.layout.gh_chat_transcript_message_component;
            if (i5 < c) {
                ou ouVar = this.a;
                Integer valueOf = Integer.valueOf(i2);
                Integer num = (Integer) ouVar.get(valueOf);
                if (num == null) {
                    Log.w("gH_ChatConvoLytAdapter", String.format("Trying to bind ViewHolder for position %d, but map has no item at that position.", new Object[]{valueOf}));
                } else if (((oky) this.e.get(num.intValue())) != null) {
                    LayoutInflater from = LayoutInflater.from(odr.s.getContext());
                    oky oky2 = (oky) this.e.get(num.intValue());
                    int intValue = num.intValue();
                    int size = this.e.size();
                    while (intValue < size) {
                        oky oky3 = (oky) this.e.get(intValue);
                        if (oky3 == null) {
                            StringBuilder sb = new StringBuilder(81);
                            sb.append("No message found for index ");
                            sb.append(intValue);
                            sb.append("; this means the message list is corrupted.");
                            Log.w("gH_ChatConvoLytAdapter", sb.toString());
                            return;
                        } else if (TextUtils.equals(oky3.b, oky2.b)) {
                            View inflate = from.inflate(i7, viewGroup);
                            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(i6);
                            String str = (String) this.g.get(intValue);
                            boolean equals = TextUtils.equals(this.m, oky2.b);
                            a(inflate, equals);
                            if (!((Boolean) this.h.get(intValue)).booleanValue()) {
                                i3 = !h(intValue) ? 3 : 1;
                            } else {
                                i3 = h(intValue) ? 4 : 2;
                            }
                            int i8 = intValue;
                            int i9 = size;
                            oky oky4 = oky2;
                            oky oky5 = oky3;
                            LinearLayout linearLayout2 = linearLayout;
                            int i10 = i3;
                            String str2 = str;
                            a(from, linearLayout, equals, i10, oky5);
                            oky oky6 = oky5;
                            if (oky6.e.size() != 0) {
                                for (int i11 = 0; i11 < oky6.e.size(); i11++) {
                                    avlz avlz = (avlz) oky6.e.get(i11);
                                    oab a2 = a(avlz);
                                    if (a2 == null) {
                                        String valueOf2 = String.valueOf(avlz);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                                        sb2.append("Failed to parse action result: ");
                                        sb2.append(valueOf2);
                                        Log.w("gH_ChatConvoLytAdapter", sb2.toString());
                                    } else {
                                        if (a2.m()) {
                                            avmf avmf = avlz.c;
                                            if (avmf == null) {
                                                avmf = avmf.b;
                                            }
                                            onClickListener = new odo(this, a2.e, Uri.parse(avmf.a));
                                        } else if (!a2.n()) {
                                            String valueOf3 = String.valueOf(avlz);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                                            sb3.append("Received unsupported action result: ");
                                            sb3.append(valueOf3);
                                            Log.w("gH_ChatConvoLytAdapter", sb3.toString());
                                        } else {
                                            onClickListener = new odp(this, a2);
                                        }
                                        View inflate2 = from.inflate(R.layout.gh_chat_transcript_chat_action, linearLayout2, false);
                                        Button button = (Button) inflate2.findViewById(R.id.gh_transcript_chat_action_button);
                                        button.setText(avlz.g.toUpperCase());
                                        button.setOnClickListener(onClickListener);
                                        linearLayout2.addView(inflate2);
                                    }
                                }
                            }
                            a((TextView) linearLayout2.findViewById(R.id.gh_transcript_message_text), oky6.c);
                            if (this.l) {
                                int size2 = this.e.size() - 1;
                                if (!f(size2)) {
                                    size2 = ((Integer) this.a.get(Integer.valueOf(c() - 1))).intValue() - 1;
                                }
                                if (i8 == size2) {
                                    View inflate3 = from.inflate(R.layout.gh_chat_transcript_inbound_message_timestamp_and_end_note, linearLayout2, true);
                                    oky2 = oky4;
                                    ((TextView) inflate3.findViewById(R.id.gh_transcript_message_info)).setText(a(oky2.d, str2));
                                    ((TextView) inflate3.findViewById(R.id.gh_chat_conversation_ended_note)).setText(inflate3.getContext().getString(R.string.gh_agent_has_ended_chat));
                                    odr.s.addView(inflate);
                                    intValue = i8 + 1;
                                    size = i9;
                                    i7 = R.layout.gh_chat_transcript_message_component;
                                    viewGroup = null;
                                    i6 = R.id.gh_transcript_message_item_component;
                                } else {
                                    oky2 = oky4;
                                    i4 = R.id.gh_transcript_message_info;
                                }
                            } else {
                                oky2 = oky4;
                                i4 = R.id.gh_transcript_message_info;
                            }
                            if (((Boolean) this.h.get(i8)).booleanValue()) {
                                String str3 = oky6.d;
                                if (!equals) {
                                    ((TextView) from.inflate(R.layout.gh_chat_transcript_inbound_message_timestamp, linearLayout2, true).findViewById(i4)).setText(a(str3, str2));
                                } else {
                                    ((TextView) from.inflate(R.layout.gh_chat_transcript_outbound_message_timestamp, linearLayout2, true).findViewById(i4)).setText(str2);
                                }
                            }
                            odr.s.addView(inflate);
                            intValue = i8 + 1;
                            size = i9;
                            i7 = R.layout.gh_chat_transcript_message_component;
                            viewGroup = null;
                            i6 = R.id.gh_transcript_message_item_component;
                        } else {
                            return;
                        }
                    }
                } else {
                    Log.w("gH_ChatConvoLytAdapter", String.format("Map should have index of first MessageEvent for ViewHolder position %d, but is null.", new Object[]{num}));
                }
            } else {
                LayoutInflater from2 = LayoutInflater.from(odr.s.getContext());
                int c2 = i5 - c();
                okz okz = (okz) this.f.get(c2);
                oky oky7 = okz.b;
                if (oky7 != null) {
                    oky = oky7;
                } else {
                    oky = oky.g;
                }
                String str4 = oky.c;
                if (str4.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(97);
                    sb4.append("No pending message found for index ");
                    sb4.append(c2);
                    sb4.append("; this means the pending message list is corrupted.");
                    Log.w("gH_ChatConvoLytAdapter", sb4.toString());
                    return;
                }
                View inflate4 = from2.inflate(R.layout.gh_chat_transcript_message_component, (ViewGroup) null);
                LinearLayout linearLayout3 = (LinearLayout) inflate4.findViewById(R.id.gh_transcript_message_item_component);
                a(inflate4, true);
                LinearLayout linearLayout4 = linearLayout3;
                a(from2, linearLayout3, true, 4, oky);
                TextView textView = (TextView) linearLayout4.findViewById(R.id.gh_transcript_message_text);
                a(textView, str4);
                if (!okz.d) {
                    ImageView imageView = (ImageView) inflate4.findViewById(R.id.gh_transcript_message_delete_icon);
                    ChatConversationChimeraActivity chatConversationChimeraActivity = this.o;
                    ofx.a(imageView, (Context) chatConversationChimeraActivity, ofy.a(chatConversationChimeraActivity, R.attr.ghf_greyIconColor));
                    imageView.setVisibility(0);
                    aufd aufd = okz.c;
                    if (aufd == null) {
                        aufd = aufd.b;
                    }
                    imageView.setOnClickListener(new odm(this, aufd.a));
                    TextView textView2 = (TextView) from2.inflate(R.layout.gh_chat_transcript_message_not_sent_note, linearLayout4, true).findViewById(R.id.gh_transcript_message_info);
                    textView2.setText(R.string.gh_chat_message_not_sent_text);
                    Drawable a3 = kf.a((Context) this.o, (int) R.drawable.quantum_ic_error_red_18);
                    if (a3 != null) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity2 = this.o;
                        Drawable b = ofx.b(a3, (Context) chatConversationChimeraActivity2, ofy.a(chatConversationChimeraActivity2, R.attr.gh_primaryRedColor));
                        int i12 = Build.VERSION.SDK_INT;
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(b, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    Context context = textView.getContext();
                    okz okz2 = (okz) this.f.get(c2);
                    oky oky8 = okz2.b;
                    if (oky8 == null) {
                        oky8 = oky.g;
                    }
                    String str5 = oky8.c;
                    aufd aufd2 = okz2.c;
                    if (aufd2 == null) {
                        aufd2 = aufd.b;
                    }
                    textView.setOnClickListener(new odn(this, str5, aufd2.a, context));
                    textView.setContentDescription(String.format("%s.\n%s", new Object[]{str4, textView.getContext().getString(R.string.gh_chat_message_not_sent_text)}));
                } else {
                    TextView textView3 = (TextView) from2.inflate(R.layout.gh_chat_transcript_outbound_message_timestamp, linearLayout4, true).findViewById(R.id.gh_transcript_message_info);
                    textView3.setText(linearLayout4.getContext().getString(R.string.common_sending));
                    textView3.setTypeface(textView3.getTypeface(), 2);
                }
                odr.s.addView(inflate4);
            }
        } else {
            View inflate5 = LayoutInflater.from(odr.s.getContext()).inflate(R.layout.gh_chat_typing_indicator, (ViewGroup) null);
            TextView textView4 = (TextView) inflate5.findViewById(R.id.gh_chat_typing_indicator_agent_initial);
            if (!TextUtils.isEmpty(this.n)) {
                textView4.setText(String.valueOf(this.n.charAt(0)));
            }
            textView4.setBackground(ofa.a(ofy.a(this.o, R.attr.gh_chatAgentInitialCircleBackgroundColor)));
            ImageView imageView2 = (ImageView) inflate5.findViewById(R.id.gh_chat_typing_indicator_ellipsis);
            if (this.t == olg.TYPING) {
                AnimationDrawable a4 = ofa.a((Context) this.o);
                imageView2.setImageDrawable(a4);
                a4.start();
            } else {
                ChatConversationChimeraActivity chatConversationChimeraActivity3 = this.o;
                imageView2.setImageDrawable(ofa.a(1, 1, 1, ofy.a(chatConversationChimeraActivity3, R.attr.ghf_greyIconColor), chatConversationChimeraActivity3));
            }
            odr.s.addView(inflate5);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        if (ofq.b(axqk.a.a().a())) {
            SpannableString valueOf = SpannableString.valueOf(str);
            Linkify.addLinks(valueOf, 15);
            URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    textView.setTextIsSelectable(true);
                    break;
                }
                oab a2 = oab.a(uRLSpanArr[i2].getURL(), oal.a(), this.o.p, true, 2);
                if (a2 != null && a2.p()) {
                    break;
                }
                i2++;
            }
            textView.setText(str);
            Linkify.addLinks(textView, 15);
        }
        textView.setFilters(new InputFilter[]{this.s});
        textView.setText(str);
        Linkify.addLinks(textView, 15);
    }

    public final void a(olg olg) {
        if (olg == olg.NO_TEXT_ENTERED) {
            this.q.removeCallbacks(this.r);
            this.k--;
            this.t = olg;
            axnx.c();
            M(this.k - 1);
            return;
        }
        if (this.t == olg.NO_TEXT_ENTERED) {
            this.q.postDelayed(this.r, (long) ((int) axmj.f()));
            this.k++;
        }
        this.t = olg;
        axnx.c();
        K(this.k - 2);
    }

    public final boolean a(oko oko) {
        oky oky;
        aufd aufd = oko.e;
        if (aufd == null) {
            aufd = aufd.b;
        }
        if (aufd.a - this.j > axmj.a.a().g()) {
            return false;
        }
        if (oko.b == 3) {
            oky = (oky) oko.c;
        } else {
            oky = oky.g;
        }
        int size = this.e.size() - 1;
        String str = oky.b;
        if (size < 0 || !TextUtils.equals(str, ((oky) this.e.get(size)).b)) {
            return false;
        }
        return true;
    }

    public final boolean a(olg olg, String str, long j2) {
        if (TextUtils.equals(str, this.m) || j2 < this.u) {
            return false;
        }
        if (olg == olg.TYPING || olg == olg.TEXT_ENTERED || olg == olg.NO_TEXT_ENTERED) {
            this.p = SystemClock.uptimeMillis();
            this.u = j2;
            if (this.t == olg) {
                return false;
            }
            a(olg);
            return true;
        }
        Log.w("gH_ChatConvoLytAdapter", String.format("Trying to update the typing indicator using an invalid typing status for the agent: %s", new Object[]{olg}));
        return false;
    }
}
