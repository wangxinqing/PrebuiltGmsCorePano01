package defpackage;

import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import java.util.Arrays;

/* renamed from: ozt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozt {
    private static final anaf a;

    static {
        anab anab = new anab();
        dtl a2 = RegisterCorpusInfo.a("omnibox");
        a2.a = "2";
        a2.a("content://com.android.chrome.icing");
        dtn a3 = RegisterSectionInfo.a("url");
        a3.a = "url";
        a3.d = true;
        a3.a(dud.b());
        a2.a(a3.a());
        dtn a4 = RegisterSectionInfo.a("title");
        a4.a = "plain";
        a4.d = true;
        a4.a(dud.c());
        a2.a(a4.a());
        dtn a5 = RegisterSectionInfo.a("indexed_url");
        a5.a = "plain";
        a5.b = true;
        a2.a(a5.a());
        dsx dsx = new dsx();
        dsx.a("text1", R.string.global_search_title_text);
        dsx.a("text2", R.string.global_search_url_text);
        dsx.a("intent_action", R.string.icing_section_template_intent_action_view);
        dsx.a("intent_data", R.string.global_search_url_text);
        dsx.a("icon", 0);
        a2.d = dsx.a();
        anab.a("com.android.chrome-omnibox", a2.a());
        dtl a6 = RegisterCorpusInfo.a("omnibox");
        a6.a = "2";
        a6.a("content://com.android.chrome.beta.icing");
        dtn a7 = RegisterSectionInfo.a("url");
        a7.a = "url";
        a7.d = true;
        a7.a(dud.b());
        a6.a(a7.a());
        dtn a8 = RegisterSectionInfo.a("title");
        a8.a = "plain";
        a8.d = true;
        a8.a(dud.c());
        a6.a(a8.a());
        dtn a9 = RegisterSectionInfo.a("indexed_url");
        a9.a = "plain";
        a9.b = true;
        a6.a(a9.a());
        dsx dsx2 = new dsx();
        dsx2.a("text1", R.string.global_search_title_text);
        dsx2.a("text2", R.string.global_search_url_text);
        dsx2.a("intent_action", R.string.icing_section_template_intent_action_view);
        dsx2.a("intent_data", R.string.global_search_url_text);
        dsx2.a("icon", 0);
        a6.d = dsx2.a();
        anab.a("com.android.chrome.beta-omnibox", a6.a());
        dtl a10 = RegisterCorpusInfo.a("omnibox");
        a10.a = "2";
        a10.a("content://com.android.chrome.dev.icing");
        dtn a11 = RegisterSectionInfo.a("url");
        a11.a = "url";
        a11.d = true;
        a11.a(dud.b());
        a10.a(a11.a());
        dtn a12 = RegisterSectionInfo.a("title");
        a12.a = "plain";
        a12.d = true;
        a12.a(dud.c());
        a10.a(a12.a());
        dtn a13 = RegisterSectionInfo.a("indexed_url");
        a13.a = "plain";
        a13.b = true;
        a10.a(a13.a());
        dsx dsx3 = new dsx();
        dsx3.a("text1", R.string.global_search_title_text);
        dsx3.a("text2", R.string.global_search_url_text);
        dsx3.a("intent_action", R.string.icing_section_template_intent_action_view);
        dsx3.a("intent_data", R.string.global_search_url_text);
        dsx3.a("icon", 0);
        a10.d = dsx3.a();
        anab.a("com.android.chrome.dev-omnibox", a10.a());
        dtl a14 = RegisterCorpusInfo.a("books");
        a14.a = "3";
        a14.a("content://com.google.android.apps.books/appdatasearch/books");
        dtn a15 = RegisterSectionInfo.a("account_name");
        a15.a = "plain";
        a15.b = true;
        a14.a(a15.a());
        dtn a16 = RegisterSectionInfo.a("volume_id");
        a16.a = "plain";
        a16.b = true;
        a14.a(a16.a());
        dtn a17 = RegisterSectionInfo.a("content_version_id");
        a17.a = "plain";
        a17.b = true;
        a14.a(a17.a());
        dtn a18 = RegisterSectionInfo.a("title");
        a18.a = "plain";
        a18.d = true;
        a18.c = 30;
        a14.a(a18.a());
        dtn a19 = RegisterSectionInfo.a("creator");
        a19.a = "plain";
        a19.d = true;
        a19.c = 20;
        a14.a(a19.a());
        dsx dsx4 = new dsx();
        dsx4.a("text1", R.string.global_search_title_text);
        dsx4.a("text2", R.string.global_search_books_text2);
        dsx4.a("icon", R.string.global_search_books_icon_uri);
        dsx4.a("intent_data", R.string.global_search_books_intent_data);
        dsx4.a("intent_extra_data", R.string.global_search_account_name_text);
        a14.d = dsx4.a();
        anab.a("com.google.android.apps.books-books", a14.a());
        dtl a20 = RegisterCorpusInfo.a("messagesCorpus");
        a20.a = "71";
        a20.a("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/messagesCorpus");
        dtn a21 = RegisterSectionInfo.a("textSection");
        a21.a = "plain";
        a21.d = true;
        a20.a(a21.a());
        dtn a22 = RegisterSectionInfo.a("conversationIdSection");
        a22.a = "plain";
        a20.a(a22.a());
        dtn a23 = RegisterSectionInfo.a("messageIdSection");
        a23.a = "plain";
        a23.b = true;
        a20.a(a23.a());
        dtn a24 = RegisterSectionInfo.a("messageTimestampSection");
        a24.a = "plain";
        a24.b = true;
        a20.a(a24.a());
        anab.a("com.google.android.apps.messaging-messagesCorpus", a20.a());
        dtl a25 = RegisterCorpusInfo.a("participantsCorpus");
        a25.a = "71";
        a25.a("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/participantsCorpus");
        dtn a26 = RegisterSectionInfo.a("participantNameSection");
        a26.a = "plain";
        a26.d = true;
        a25.a(a26.a());
        dtn a27 = RegisterSectionInfo.a("conversationIdSection");
        a27.a = "plain";
        a27.b = true;
        a25.a(a27.a());
        anab.a("com.google.android.apps.messaging-participantsCorpus", a25.a());
        dtl a28 = RegisterCorpusInfo.a("partsCorpus");
        a28.a = "71";
        a28.a("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/partsCorpus");
        dtn a29 = RegisterSectionInfo.a("textSection");
        a29.a = "plain";
        a29.d = true;
        a28.a(a29.a());
        dtn a30 = RegisterSectionInfo.a("conversationIdSection");
        a30.a = "plain";
        a28.a(a30.a());
        dtn a31 = RegisterSectionInfo.a("messageIdSection");
        a31.a = "plain";
        a31.b = true;
        a28.a(a31.a());
        dtn a32 = RegisterSectionInfo.a("messageTimestampSection");
        a32.a = "plain";
        a32.b = true;
        a28.a(a32.a());
        anab.a("com.google.android.apps.messaging-partsCorpus", a28.a());
        dtl a33 = RegisterCorpusInfo.a("messages");
        a33.a = "1";
        a33.a("content://gmail-appindexing/appdatasearch");
        a33.h = "EmailMessage";
        a33.i = true;
        dtn a34 = RegisterSectionInfo.a("from_address");
        a34.a = "rfc822";
        a34.d = true;
        a34.f = "author";
        a33.a(a34.a());
        dtn a35 = RegisterSectionInfo.a("to_addresses");
        a35.a = "rfc822";
        a35.d = true;
        a35.f = "recipient";
        a33.a(a35.a());
        dtn a36 = RegisterSectionInfo.a("subject");
        a36.a = "plain";
        a36.d = true;
        a36.f = "about";
        a33.a(a36.a());
        dtn a37 = RegisterSectionInfo.a("body");
        a37.a = "html";
        a37.f = "text";
        a33.a(a37.a());
        dtn a38 = RegisterSectionInfo.a("conversation");
        a38.a = "plain";
        a38.b = true;
        a33.a(a38.a());
        dtn a39 = RegisterSectionInfo.a("message_id");
        a39.a = "plain";
        a39.b = true;
        a33.a(a39.a());
        dtn a40 = RegisterSectionInfo.a("permalink");
        a40.a = "plain";
        a40.f = "url";
        a33.a(a40.a());
        dtn a41 = RegisterSectionInfo.a("date");
        a41.a = "plain";
        a41.b = true;
        a41.f = "receivedTime";
        a33.a(a41.a());
        anab.a("com.google.android.gm-messages", a33.a());
        dtl a42 = RegisterCorpusInfo.a("apps");
        a42.a = "2";
        a42.a("content://com.google.android.gms.icing.proxy.apps");
        a42.h = "CreativeWork/SoftwareApplication";
        dtn a43 = RegisterSectionInfo.a("name");
        a43.a = "plain";
        a43.d = true;
        a43.c = 63;
        a43.f = "name";
        a42.a(a43.a());
        dtn a44 = RegisterSectionInfo.a("icon_uri");
        a44.a = "plain";
        a44.b = true;
        a42.a(a44.a());
        dtn a45 = RegisterSectionInfo.a("package_name");
        a45.a = "plain";
        a45.b = true;
        a42.a(a45.a());
        dtn a46 = RegisterSectionInfo.a("class_name");
        a46.a = "plain";
        a46.b = true;
        a42.a(a46.a());
        dtn a47 = RegisterSectionInfo.a("last_update_millis");
        a47.a = "plain";
        a47.b = true;
        a42.a(a47.a());
        dtn a48 = RegisterSectionInfo.a("additional_names");
        a48.a = "plain";
        a48.d = true;
        a48.e = "\n";
        a42.a(a48.a());
        dsx dsx5 = new dsx();
        dsx5.a("text1", R.string.icing_section_template_apps_text_1);
        dsx5.a("icon", R.string.icing_section_template_apps_icon_uri);
        dsx5.a("intent_action", R.string.icing_section_template_apps_intent_action);
        dsx5.a("intent_data", R.string.icing_section_template_apps_intent_data);
        dsx5.a(dsz.a());
        a42.d = dsx5.a();
        anab.a("com.google.android.gms-apps", a42.a());
        dtl a49 = RegisterCorpusInfo.a("contacts_contact_id");
        a49.a = "1";
        a49.a("content://com.google.android.gms.icing.proxy/appdatasearch/contacts_contact_id");
        a49.h = "Person";
        dtn a50 = RegisterSectionInfo.a("lookup_key");
        a50.a = "plain";
        a49.a(a50.a());
        dtn a51 = RegisterSectionInfo.a("icon_uri");
        a51.a = "plain";
        a51.b = true;
        a49.a(a51.a());
        dtn a52 = RegisterSectionInfo.a("name");
        a52.a = "plain";
        a52.d = true;
        a52.c = 5;
        a49.a(a52.a());
        dtn a53 = RegisterSectionInfo.a("givennames");
        a53.a = "plain";
        a53.d = true;
        a53.c = 20;
        a53.a(dud.a());
        a49.a(a53.a());
        dtn a54 = RegisterSectionInfo.a("email");
        a54.a = "rfc822";
        a54.b = true;
        a54.c = 2;
        a54.e = "";
        a49.a(a54.a());
        dtn a55 = RegisterSectionInfo.a("nickname");
        a55.a = "plain";
        a55.d = true;
        a55.c = 15;
        a55.e = "";
        a55.a(dud.a());
        a49.a(a55.a());
        dtn a56 = RegisterSectionInfo.a("number");
        a56.a = "plain";
        a56.b = true;
        a56.e = "";
        a49.a(a56.a());
        dtn a57 = RegisterSectionInfo.a("address");
        a57.a = "plain";
        a57.b = true;
        a57.e = "";
        a49.a(a57.a());
        dtn a58 = RegisterSectionInfo.a("phoneticname");
        a58.a = "plain";
        a58.d = true;
        a58.c = 10;
        a49.a(a58.a());
        dsx dsx6 = new dsx();
        dsx6.a("text1", R.string.icing_section_template_contacts_text_1);
        dsx6.a("text2", R.string.icing_section_template_contacts_text_2);
        dsx6.a("icon", R.string.icing_section_template_contacts_icon_uri);
        dsx6.a("intent_action", R.string.icing_section_template_intent_action_view);
        dsx6.a("intent_data", R.string.icing_section_template_contacts_intent_data);
        dsx6.a(dsz.a());
        a49.d = dsx6.a();
        anab.a("com.google.android.gms-contacts_contact_id", a49.a());
        dtl a59 = RegisterCorpusInfo.a("emails_data_id");
        a59.a = "1";
        a59.a("content://com.google.android.gms.icing.proxy/appdatasearch/emails_data_id");
        a59.h = "ContactPoint";
        dtn a60 = RegisterSectionInfo.a("contact_id");
        a60.a = "plain";
        a59.a(a60.a());
        dtn a61 = RegisterSectionInfo.a("type");
        a61.a = "plain";
        a59.a(a61.a());
        dtn a62 = RegisterSectionInfo.a("label");
        a62.a = "plain";
        a59.a(a62.a());
        dtn a63 = RegisterSectionInfo.a("data");
        a63.a = "plain";
        a59.a(a63.a());
        dsx dsx7 = new dsx();
        dsx7.a("text1", R.string.icing_section_template_contacts_id);
        a59.d = dsx7.a();
        anab.a("com.google.android.gms-emails_data_id", a59.a());
        dtl a64 = RegisterCorpusInfo.a("phones_data_id");
        a64.a = "1";
        a64.a("content://com.google.android.gms.icing.proxy/appdatasearch/phones_data_id");
        a64.h = "ContactPoint";
        dtn a65 = RegisterSectionInfo.a("contact_id");
        a65.a = "plain";
        a64.a(a65.a());
        dtn a66 = RegisterSectionInfo.a("type");
        a66.a = "plain";
        a64.a(a66.a());
        dtn a67 = RegisterSectionInfo.a("label");
        a67.a = "plain";
        a64.a(a67.a());
        dtn a68 = RegisterSectionInfo.a("data");
        a68.a = "plain";
        a64.a(a68.a());
        dsx dsx8 = new dsx();
        dsx8.a("text1", R.string.icing_section_template_contacts_id);
        a64.d = dsx8.a();
        anab.a("com.google.android.gms-phones_data_id", a64.a());
        dtl a69 = RegisterCorpusInfo.a("postals_data_id");
        a69.a = "1";
        a69.a("content://com.google.android.gms.icing.proxy/appdatasearch/postals_data_id");
        a69.h = "ContactPoint";
        dtn a70 = RegisterSectionInfo.a("contact_id");
        a70.a = "plain";
        a69.a(a70.a());
        dtn a71 = RegisterSectionInfo.a("type");
        a71.a = "plain";
        a69.a(a71.a());
        dtn a72 = RegisterSectionInfo.a("label");
        a72.a = "plain";
        a69.a(a72.a());
        dtn a73 = RegisterSectionInfo.a("data");
        a73.a = "plain";
        a69.a(a73.a());
        dsx dsx9 = new dsx();
        dsx9.a("text1", R.string.icing_section_template_contacts_id);
        a69.d = dsx9.a();
        anab.a("com.google.android.gms-postals_data_id", a69.a());
        dtl a74 = RegisterCorpusInfo.a("sms");
        a74.a = "3";
        a74.a("content://com.google.android.gms.icing.proxy.sms/appdatasearch/sms");
        a74.h = "CreativeWork/ShortMessage";
        dtn a75 = RegisterSectionInfo.a("_id");
        a75.a = "plain";
        a75.b = true;
        a75.f = "id";
        a74.a(a75.a());
        dtn a76 = RegisterSectionInfo.a("type");
        a76.a = "plain";
        a76.f = "type";
        a74.a(a76.a());
        dtn a77 = RegisterSectionInfo.a("thread_id");
        a77.a = "plain";
        a77.f = "threadId";
        a74.a(a77.a());
        dtn a78 = RegisterSectionInfo.a("address");
        a78.a = "plain";
        a78.d = true;
        a78.f = "otherPartyAddress";
        a78.e = ",";
        a74.a(a78.a());
        dtn a79 = RegisterSectionInfo.a("date");
        a79.a = "plain";
        a79.d = true;
        a79.f = "receivedTime";
        a74.a(a79.a());
        dtn a80 = RegisterSectionInfo.a("subject");
        a80.a = "plain";
        a80.d = true;
        a80.f = "subject";
        a74.a(a80.a());
        dtn a81 = RegisterSectionInfo.a("body");
        a81.a = "plain";
        a81.d = true;
        a81.f = "body";
        a81.a(dud.a("AddressAnnotator", "DateAnnotator", "PhoneAnnotator", "UrlAnnotator"));
        a74.a(a81.a());
        dtn a82 = RegisterSectionInfo.a("read");
        a82.a = "plain";
        a82.f = "readStatus";
        a74.a(a82.a());
        dtn a83 = RegisterSectionInfo.a("content_type");
        a83.a = "plain";
        a83.d = true;
        a83.f = "contentType";
        a83.e = ",";
        a74.a(a83.a());
        dtn a84 = RegisterSectionInfo.a("media_uri");
        a84.a = "plain";
        a84.b = true;
        a84.f = "mediaUri";
        a74.a(a84.a());
        dsx dsx10 = new dsx();
        dsx10.a("text1", R.string.icing_section_template_sms_text_1);
        dsx10.a("text2", R.string.icing_section_template_sms_text_2);
        dsx10.a("intent_action", R.string.icing_section_template_intent_action_view);
        dsx10.a("intent_data", R.string.icing_section_template_sms_intent_data);
        a74.d = dsx10.a();
        anab.a("com.google.android.gms-sms", a74.a());
        dtl a85 = RegisterCorpusInfo.a("suggest_query");
        a85.a = "0";
        a85.a("content://com.google.android.googlequicksearchbox.OnDeviceWebSuggestHostProvider/suggest_query");
        dtn a86 = RegisterSectionInfo.a("query");
        a86.a = "plain";
        a86.d = true;
        a85.a(a86.a());
        dsx dsx11 = new dsx();
        dsx11.a("text1", R.string.global_search_query_text);
        a85.d = dsx11.a();
        anab.a("com.google.android.googlequicksearchbox-suggest_query", a85.a());
        dtl a87 = RegisterCorpusInfo.a("albums");
        a87.a = "2";
        a87.a("content://com.google.android.music.icing/appdatasearch/albums");
        a87.h = "MusicAlbum";
        dtn a88 = RegisterSectionInfo.a("album");
        a88.a = "plain";
        a88.d = true;
        a88.f = "name";
        a87.a(a88.a());
        dtn a89 = RegisterSectionInfo.a("artist");
        a89.a = "plain";
        a89.b = true;
        a89.f = "byArtist";
        a87.a(a89.a());
        dtn a90 = RegisterSectionInfo.a("local_copy_type");
        a90.a = "plain";
        a90.b = true;
        a87.a(a90.a());
        dsx dsx12 = new dsx();
        dsx12.a("text1", R.string.albums_corpus_section_text_1);
        dsx12.a("text2", R.string.albums_corpus_section_text_2);
        dsx12.a("icon", R.string.albums_corpus_section_icon_uri);
        dsx12.a("intent_data", R.string.albums_corpus_section_data);
        a87.d = dsx12.a();
        anab.a("com.google.android.music-albums", a87.a());
        dtl a91 = RegisterCorpusInfo.a("artists");
        a91.a = "2";
        a91.a("content://com.google.android.music.icing/appdatasearch/artists");
        a91.h = "MusicGroup";
        dtn a92 = RegisterSectionInfo.a("artist");
        a92.a = "plain";
        a92.d = true;
        a92.f = "name";
        a91.a(a92.a());
        dtn a93 = RegisterSectionInfo.a("local_copy_type");
        a93.a = "plain";
        a93.b = true;
        a91.a(a93.a());
        dsx dsx13 = new dsx();
        dsx13.a("text1", R.string.artists_corpus_section_text_1);
        dsx13.a("text2", R.string.artists_corpus_section_text_2);
        dsx13.a("icon", R.string.artists_corpus_section_icon_uri);
        dsx13.a("intent_data", R.string.artists_corpus_section_data);
        a91.d = dsx13.a();
        anab.a("com.google.android.music-artists", a91.a());
        dtl a94 = RegisterCorpusInfo.a("playlists");
        a94.a = "2";
        a94.a("content://com.google.android.music.icing/appdatasearch/playlists");
        a94.h = "MusicPlaylist";
        dtn a95 = RegisterSectionInfo.a("playlist");
        a95.a = "plain";
        a95.d = true;
        a95.f = "name";
        a94.a(a95.a());
        dsx dsx14 = new dsx();
        dsx14.a("text1", R.string.playlists_corpus_section_text_1);
        dsx14.a("icon", R.string.playlists_corpus_section_icon_uri);
        dsx14.a("intent_data", R.string.playlists_corpus_section_data);
        a94.d = dsx14.a();
        anab.a("com.google.android.music-playlists", a94.a());
        dtl a96 = RegisterCorpusInfo.a("songs");
        a96.a = "2";
        a96.a("content://com.google.android.music.icing/appdatasearch/songs");
        a96.h = "MusicRecording";
        dtn a97 = RegisterSectionInfo.a("song");
        a97.a = "plain";
        a97.d = true;
        a97.f = "name";
        a96.a(a97.a());
        dtn a98 = RegisterSectionInfo.a("artist");
        a98.a = "plain";
        a98.b = true;
        a98.f = "byArtist";
        a96.a(a98.a());
        dtn a99 = RegisterSectionInfo.a("album_id");
        a99.a = "plain";
        a99.b = true;
        a96.a(a99.a());
        dtn a100 = RegisterSectionInfo.a("music_id");
        a100.a = "plain";
        a100.b = true;
        a96.a(a100.a());
        dtn a101 = RegisterSectionInfo.a("song_id");
        a101.a = "plain";
        a101.b = true;
        a96.a(a101.a());
        dtn a102 = RegisterSectionInfo.a("album");
        a102.a = "plain";
        a102.b = true;
        a96.a(a102.a());
        dtn a103 = RegisterSectionInfo.a("local_copy_type");
        a103.a = "plain";
        a103.b = true;
        a96.a(a103.a());
        dsx dsx15 = new dsx();
        dsx15.a("text1", R.string.songs_corpus_section_text_1);
        dsx15.a("text2", R.string.songs_corpus_section_text_2);
        dsx15.a("icon", R.string.songs_corpus_section_icon_uri);
        dsx15.a("intent_data", R.string.songs_corpus_section_data);
        a96.d = dsx15.a();
        anab.a("com.google.android.music-songs", a96.a());
        dtl a104 = RegisterCorpusInfo.a("top_albums");
        a104.a = "1";
        a104.a("content://com.google.android.music.icing/appdatasearch/top_albums");
        dtn a105 = RegisterSectionInfo.a("album");
        a105.a = "plain";
        a105.d = true;
        a105.f = "name";
        a104.a(a105.a());
        dtn a106 = RegisterSectionInfo.a("album_id");
        a106.a = "plain";
        a106.b = true;
        a104.a(a106.a());
        dtn a107 = RegisterSectionInfo.a("album_url");
        a107.a = "plain";
        a107.b = true;
        a104.a(a107.a());
        dtn a108 = RegisterSectionInfo.a("artist");
        a108.a = "plain";
        a108.b = true;
        a108.f = "byArtist";
        a104.a(a108.a());
        dsx dsx16 = new dsx();
        dsx16.a("text1", R.string.top_albums_corpus_section_text_1);
        dsx16.a("text2", R.string.top_albums_corpus_section_text_2);
        dsx16.a("intent_activity", R.string.top_albums_corpus_section_intent_activity);
        dsx16.a("intent_data", R.string.top_albums_corpus_section_data);
        a104.d = dsx16.a();
        anab.a("com.google.android.music-top_albums", a104.a());
        dtl a109 = RegisterCorpusInfo.a("top_artists");
        a109.a = "1";
        a109.a("content://com.google.android.music.icing/appdatasearch/top_artists");
        dtn a110 = RegisterSectionInfo.a("artist");
        a110.a = "plain";
        a110.d = true;
        a110.f = "name";
        a109.a(a110.a());
        dtn a111 = RegisterSectionInfo.a("artist_id");
        a111.a = "plain";
        a111.b = true;
        a109.a(a111.a());
        dtn a112 = RegisterSectionInfo.a("artist_url");
        a112.a = "plain";
        a112.b = true;
        a109.a(a112.a());
        dsx dsx17 = new dsx();
        dsx17.a("text1", R.string.top_artists_corpus_section_text_1);
        dsx17.a("text2", R.string.top_artists_corpus_section_text_2);
        dsx17.a("icon", R.string.top_artists_corpus_section_icon_uri);
        dsx17.a("intent_activity", R.string.top_artists_corpus_section_intent_activity);
        dsx17.a("intent_data", R.string.top_artists_corpus_section_data);
        a109.d = dsx17.a();
        anab.a("com.google.android.music-top_artists", a109.a());
        dtl a113 = RegisterCorpusInfo.a("top_tracks");
        a113.a = "1";
        a113.a("content://com.google.android.music.icing/appdatasearch/top_tracks");
        dtn a114 = RegisterSectionInfo.a("track");
        a114.a = "plain";
        a114.d = true;
        a114.f = "name";
        a113.a(a114.a());
        dtn a115 = RegisterSectionInfo.a("track_id");
        a115.a = "plain";
        a115.b = true;
        a113.a(a115.a());
        dtn a116 = RegisterSectionInfo.a("track_url");
        a116.a = "plain";
        a116.b = true;
        a113.a(a116.a());
        dtn a117 = RegisterSectionInfo.a("artist");
        a117.a = "plain";
        a117.b = true;
        a113.a(a117.a());
        dsx dsx18 = new dsx();
        dsx18.a("text1", R.string.top_tracks_corpus_section_text_1);
        dsx18.a("text2", R.string.top_tracks_corpus_section_text_2);
        dsx18.a("icon", R.string.top_tracks_corpus_section_icon_uri);
        dsx18.a("intent_activity", R.string.top_tracks_corpus_section_intent_activity);
        dsx18.a("intent_data", R.string.top_tracks_corpus_section_data);
        a113.d = dsx18.a();
        anab.a("com.google.android.music-top_tracks", a113.a());
        dtl a118 = RegisterCorpusInfo.a("movies");
        a118.a = "0";
        a118.a("content://com.google.android.videos.icing/appdatasearch/movies");
        dtn a119 = RegisterSectionInfo.a("title");
        a119.a = "plain";
        a119.d = true;
        a118.a(a119.a());
        dtn a120 = RegisterSectionInfo.a("account");
        a120.a = "plain";
        a120.b = true;
        a118.a(a120.a());
        dsx dsx19 = new dsx();
        dsx19.a("text1", R.string.global_search_title_text);
        dsx19.a("icon", R.string.global_search_movie_icon);
        dsx19.a("intent_data", R.string.global_search_movie_intent_data);
        dsx19.a("intent_extra_data", R.string.global_search_intent_extra_data_account);
        a118.d = dsx19.a();
        anab.a("com.google.android.videos-movies", a118.a());
        dtl a121 = RegisterCorpusInfo.a("shows");
        a121.a = "0";
        a121.a("content://com.google.android.videos.icing/appdatasearch/shows");
        dtn a122 = RegisterSectionInfo.a("title");
        a122.a = "plain";
        a122.d = true;
        a121.a(a122.a());
        dtn a123 = RegisterSectionInfo.a("account");
        a123.a = "plain";
        a123.b = true;
        a121.a(a123.a());
        dsx dsx20 = new dsx();
        dsx20.a("text1", R.string.global_search_title_text);
        dsx20.a("icon", R.string.global_search_show_icon);
        dsx20.a("intent_data", R.string.global_search_show_intent_data);
        dsx20.a("intent_extra_data", R.string.global_search_intent_extra_data_account);
        a121.d = dsx20.a();
        anab.a("com.google.android.videos-shows", a121.a());
        a = anab.a();
    }

    private static boolean a(GlobalSearchCorpusConfig globalSearchCorpusConfig, Resources resources, GlobalSearchCorpusConfig globalSearchCorpusConfig2, Resources resources2, int i) {
        if (globalSearchCorpusConfig == null) {
            return globalSearchCorpusConfig2 == null;
        }
        if (globalSearchCorpusConfig2 != null && Arrays.equals(globalSearchCorpusConfig.b, globalSearchCorpusConfig2.b)) {
            int[] iArr = globalSearchCorpusConfig.a;
            if (iArr != null) {
                int[] iArr2 = globalSearchCorpusConfig2.a;
                if (iArr2 == null || iArr.length != iArr2.length) {
                    return false;
                }
                int i2 = 0;
                while (true) {
                    int[] iArr3 = globalSearchCorpusConfig.a;
                    if (i2 >= iArr3.length) {
                        return true;
                    }
                    if (i2 != i) {
                        int i3 = iArr3[i2];
                        if (i3 != 0) {
                            if (globalSearchCorpusConfig2.a[i2] == 0) {
                                break;
                            }
                            try {
                                if (!ius.a(resources.getString(i3), resources2.getString(globalSearchCorpusConfig2.a[i2]))) {
                                    return false;
                                }
                            } catch (Resources.NotFoundException e) {
                            }
                        } else if (globalSearchCorpusConfig2.a[i2] != 0) {
                            return false;
                        }
                    }
                    i2++;
                }
                return false;
            } else if (globalSearchCorpusConfig2.a == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r10, com.google.android.gms.appdatasearch.RegisterCorpusInfo r11, android.content.res.Resources r12, android.content.res.Resources r13) {
        /*
            java.lang.String r0 = r11.a
            android.accounts.Account r1 = r11.g
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 1
            int r2 = r2 + r5
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r10)
            java.lang.String r2 = "-"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            r4 = 0
            if (r1 == 0) goto L_0x009e
            java.lang.String r3 = r1.type
            java.lang.String r3 = android.net.Uri.encode(r3)
            java.lang.String r6 = r1.name
            java.lang.String r6 = android.net.Uri.encode(r6)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 2
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "/"
            r9.append(r7)
            r9.append(r3)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            boolean r6 = r0.endsWith(r3)
            if (r6 == 0) goto L_0x009c
            int r6 = r0.length()
            int r3 = r3.length()
            int r6 = r6 - r3
            java.lang.String r0 = r0.substring(r4, r6)
            java.lang.String r3 = java.lang.String.valueOf(r10)
            int r3 = r3.length()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r3 = r3 + r5
            int r3 = r3 + r6
            r7.<init>(r3)
            r7.append(r10)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r3 = r7.toString()
            goto L_0x009f
        L_0x009c:
            r0 = 0
            goto L_0x00b0
        L_0x009e:
        L_0x009f:
            anaf r0 = a
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r0 = (com.google.android.gms.appdatasearch.RegisterCorpusInfo) r0
            if (r0 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            if (r1 == 0) goto L_0x00b0
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r0 = r0.a((android.accounts.Account) r1)
        L_0x00b0:
            if (r0 == 0) goto L_0x013a
            boolean r1 = r0.j
            boolean r2 = r11.j
            if (r1 != r2) goto L_0x013a
            int r1 = r0.k
            int r2 = r11.k
            if (r1 != r2) goto L_0x013a
            boolean r1 = r0.f
            boolean r2 = r11.f
            if (r1 != r2) goto L_0x013a
            java.lang.String r1 = r0.a
            java.lang.String r2 = r11.a
            boolean r1 = defpackage.ius.a(r1, r2)
            if (r1 == 0) goto L_0x013a
            java.lang.String r1 = r0.b
            java.lang.String r2 = r11.b
            boolean r1 = defpackage.ius.a(r1, r2)
            if (r1 == 0) goto L_0x013a
            android.net.Uri r1 = r0.c
            android.net.Uri r2 = r11.c
            boolean r1 = defpackage.ius.a(r1, r2)
            if (r1 == 0) goto L_0x013a
            android.accounts.Account r1 = r0.g
            android.accounts.Account r2 = r11.g
            boolean r1 = defpackage.ius.a(r1, r2)
            if (r1 == 0) goto L_0x013a
            java.lang.String r1 = r0.i
            java.lang.String r2 = r11.i
            boolean r1 = defpackage.ius.a(r1, r2)
            if (r1 == 0) goto L_0x013a
            com.google.android.gms.appdatasearch.RegisterSectionInfo[] r1 = r0.d
            com.google.android.gms.appdatasearch.RegisterSectionInfo[] r2 = r11.d
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x013a
            com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig r0 = r0.e
            com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig r1 = r11.e
            java.lang.String r2 = "com.android.chrome"
            boolean r2 = r2.equals(r10)
            r3 = -1
            if (r2 != 0) goto L_0x0120
            java.lang.String r2 = "com.android.chrome.beta"
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0116
            goto L_0x0120
        L_0x0116:
            java.lang.String r2 = "com.android.chrome.dev"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0120
            goto L_0x0133
        L_0x0120:
            java.lang.String r10 = r11.a
            java.lang.String r11 = "omnibox"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0132
            java.lang.String r10 = "icon"
            int r3 = defpackage.dtb.a((java.lang.String) r10)
            goto L_0x0133
        L_0x0132:
        L_0x0133:
            boolean r10 = a(r0, r13, r1, r12, r3)
            if (r10 == 0) goto L_0x013a
            return r5
        L_0x013a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozt.a(java.lang.String, com.google.android.gms.appdatasearch.RegisterCorpusInfo, android.content.res.Resources, android.content.res.Resources):boolean");
    }
}
