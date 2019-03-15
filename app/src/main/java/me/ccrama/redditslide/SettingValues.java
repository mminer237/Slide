package me.ccrama.redditslide;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import me.ccrama.redditslide.Fragments.SettingsHandlingFragment;
import me.ccrama.redditslide.Views.CreateCardView;
import me.ccrama.redditslide.Visuals.Palette;
import me.ccrama.redditslide.util.SortingUtil;
import net.dean.jraw.models.CommentSort;
import net.dean.jraw.paginators.Sorting;
import net.dean.jraw.paginators.TimePeriod;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by ccrama on 9/19/2015.
 */
public class SettingValues {
    public static final String PREF_SINGLE                    = "Single";
    public static final String PREF_FAB                       = "Fab";
    public static final String PREF_UPVOTE_PERCENTAGE         = "upvotePercentage";
    public static final String PREF_FAB_TYPE                  = "FabType";
    public static final String PREF_DAY_TIME                  = "day";
    public static final String PREF_VOTE_GESTURES             = "voteGestures";
    public static final String PREF_NIGHT_MODE_STATE = "nightModeState";
    public static final String PREF_NIGHT_MODE                = "nightMode";
    public static final String PREF_NIGHT_THEME               = "nightTheme";
    public static final String PREF_TYPE_IN_TEXT              = "typeInText";
    public static final String PREF_AUTOHIDE_COMMENTS         = "autohideComments";
    public static final String PREF_SHOW_COLLAPSE_EXPAND      = "showCollapseExpand";
    public static final String PREF_NO_IMAGES                 = "noImages";
    public static final String PREF_AUTOTHEME                 = "autotime";
    public static final String PREVIEWS_LEFT                  = "previewsLeft";
    public static final String PREF_ALPHABETIZE_SUBSCRIBE     = "alphabetizeSubscribe";
    public static final String PREF_COLOR_BACK                = "colorBack";
    public static final String PREF_IMAGE_SUBFOLDERS          = "imageSubfolders";
    public static final String PREF_COLOR_NAV_BAR             = "colorNavBar";
    public static final String PREF_READER_MODE               = "readerDefault";
    public static final String PREF_READER_NIGHT              = "readernight";
    public static final String PREF_COLOR_EVERYWHERE          = "colorEverywhere";
    public static final String PREF_EXPANDED_TOOLBAR          = "expandedToolbar";
    public static final String PREF_SWAP                      = "Swap";
    public static final String PREF_ACTIONBAR_VISIBLE         = "actionbarVisible";
    public static final String PREF_SMALL_TAG                 = "smallTag";
    public static final String PREF_ACTIONBAR_TAP             = "actionbarTap";
    public static final String PREF_STORE_HISTORY             = "storehistory";
    public static final String PREF_STORE_NSFW_HISTORY        = "storensfw";
    public static final String PREF_SCROLL_SEEN               = "scrollSeen";
    public static final String PREF_TITLE_FILTERS             = "titleFilters";
    public static final String PREF_TEXT_FILTERS              = "textFilters";
    public static final String PREF_DOMAIN_FILTERS            = "domainFilters";
    public static final String PREF_ALWAYS_EXTERNAL           = "alwaysExternal";
    public static final String PREF_DRAFTS                    = "drafts";
    public static final String PREF_SUBREDDIT_FILTERS         = "subredditFilters";
    public static final String PREF_ABBREVIATE_SCORES         = "abbreviateScores";
    public static final String PREF_FLAIR_FILTERS             = "subFlairFilters";
    public static final String PREF_COMMENT_LAST_VISIT        = "commentLastVisit";
    public static final String PREF_VOTES_INFO_LINE           = "votesInfoLine";
    public static final String PREF_TYPE_INFO_LINE            = "typeInfoLine";
    public static final String PREF_COMMENT_PAGER             = "commentPager";
    public static final String PREF_COLLAPSE_COMMENTS         = "collapseCOmments";
    public static final String PREF_COLLAPSE_COMMENTS_DEFAULT = "collapseCommentsDefault";
    public static final String PREF_RIGHT_HANDED_COMMENT_MENU = "rightHandedCommentMenu";
    public static final String PREF_DUAL_PORTRAIT             = "dualPortrait";
    public static final String PREF_SINGLE_COLUMN_MULTI       = "singleColumnMultiWindow";
    public static final String PREF_CROP_IMAGE                = "cropImage";
    public static final String PREF_COMMENT_FAB               = "commentFab";
    public static final String PREF_SWITCH_THUMB              = "switchThumb";
    public static final String PREF_BIG_THUMBS                = "bigThumbnails";
    public static final String PREF_LOW_RES_ALWAYS            = "lowResAlways";
    public static final String PREF_LOW_RES_MOBILE            = "lowRes";
    public static final String PREF_IMAGE_LQ                  = "imageLq";
    public static final String PREF_COLOR_SUB_NAME            = "colorSubName";
    public static final String PREF_OVERRIDE_LANGUAGE         = "overrideLanguage";
    public static final String PREF_IMMERSIVE_MODE            = "immersiveMode";
    public static final String PREF_SHOW_DOMAIN               = "showDomain";
    public static final String PREF_CARD_TEXT                 = "cardText";
    public static final String PREF_ZOOM_DEFAULT              = "zoomDefault";
    public static final String PREF_SUBREDDIT_SEARCH_METHOD   = "subredditSearchMethod";
    public static final String PREF_BACK_BUTTON_BEHAVIOR      = "backButtonBehavior";
    public static final String PREF_LQ_LOW                    = "lqLow";
    public static final String PREF_LQ_MID                    = "lqMid";
    public static final String PREF_LQ_HIGH                   = "lqHigh";
    public static final String PREF_SOUND_NOTIFS              = "soundNotifs";
    public static final String PREF_COOKIES                   = "storeCookies";
    public static final String PREF_NIGHT_START               = "nightStart";
    public static final String PREF_NIGHT_END                 = "nightEnd";
    public static final String PREF_IGNORE_SUB_SETTINGS       = "ignoreSub";
    public static final String PREF_HIGHLIGHT_TIME            = "highlightTime";
    public static final String PREF_MUTE                      = "muted";
    public static final String PREF_LINK_HANDLING_MODE        = "linkHandlingMode";

    public static final String PREF_FULL_COMMENT_OVERRIDE  = "fullCommentOverride";
    public static final String PREF_ALBUM                  = "album";
    public static final String PREF_GIF                    = "gif";
    public static final String PREF_FASTSCROLL             = "Fastscroll";
    public static final String PREF_FAB_CLEAR              = "fabClear";
    public static final String PREF_HIDEBUTTON             = "Hidebutton";
    public static final String PREF_SAVE_BUTTON            = "saveButton";
    public static final String PREF_IMAGE                  = "image";
    public static final String PREF_SELFTEXT_IMAGE_COMMENT = "selftextImageComment";
    public static final String SYNCCIT_AUTH                = "SYNCCIT_AUTH";
    public static final String SYNCCIT_NAME                = "SYNCCIT_NAME";
    public static final String PREF_BLUR                   = "blur";
    public static final String PREF_ALBUM_SWIPE            = "albumswipe";
    public static final String PREF_COMMENT_NAV            = "commentVolumeNav";
    public static final String PREF_COLOR_COMMENT_DEPTH    = "colorCommentDepth";
    public static final String COMMENT_DEPTH               = "commentDepth";
    public static final String COMMENT_COUNT               = "commentcount";
    public static final String PREF_USER_FILTERS           = "userFilters";
    public static final String PREF_COLOR_ICON             = "colorIcon";
    public static final String PREF_PEEK                   = "peek";
    public static final String PREF_LARGE_LINKS            = "largeLinks";
    public static final String PREF_LARGE_DEPTH            = "largeDepth";
    public static final String PREF_TITLE_TOP              = "titleTop";
    public static final String PREF_HIGHLIGHT_COMMENT_OP   = "commentOP";
    public static final String PREF_LONG_LINK              = "shareLongLink";
    public static final String PREF_SELECTED_BROWSER       = "selectedBrowser";
    public static final String PREF_SELECTED_DRAWER_ITEMS  = "selectedDrawerItems";
    public static final String PREF_MOD_REMOVAL_TYPE       = "removalReasonType";
    public static final String PREF_MOD_TOOLBOX_ENABLED    = "toolboxEnabled";
    public static final String PREF_MOD_TOOLBOX_MESSAGE    = "toolboxMessageType";
    public static final String PREF_MOD_TOOLBOX_STICKY     = "toolboxSticky";
    public static final String PREF_MOD_TOOLBOX_LOCK       = "toolboxLock";
    public static final String PREF_MOD_TOOLBOX_MODMAIL    = "toolboxModmail";

    public static CreateCardView.CardEnum defaultCardView;
    public static Sorting                 defaultSorting;
    public static TimePeriod              timePeriod;
    public static CommentSort             defaultCommentSorting;
    public static boolean                 middleImage;
    public static boolean                 bigPicEnabled;
    public static boolean                 bigPicCropped;
    public static ColorMatchingMode       colorMatchingMode;
    public static ColorIndicator          colorIndicator;
    public static Palette.ThemeEnum       theme;
    public static SharedPreferences       prefs;
    public static boolean                 expandedToolbar;
    public static boolean                 single;
    public static boolean                 swap;
    public static boolean                 album;
    public static boolean                 cache;
    public static boolean                 expandedSettings;
    public static boolean                 fabComments;
    public static boolean                 largeDepth;
    public static boolean                 cacheDefault;
    public static boolean                 image;
    public static boolean                 video;
    public static boolean                 upvotePercentage;
    public static boolean                 colorBack;
    public static boolean                 colorNavBar;
    public static boolean                 actionbarVisible;
    public static boolean                 actionbarTap;
    public static boolean                 commentAutoHide;
    public static boolean                 showCollapseExpand;
    public static boolean                 fullCommentOverride;
    public static boolean lowResAlways;
    public static boolean noImages;
    public static boolean lowResMobile;
    public static boolean blurCheck;
    public static boolean readerNight;
    public static boolean swipeAnywhere;
    public static boolean commentLastVisit;
    public static boolean storeHistory;
    public static boolean showNSFWContent;
    public static boolean storeNSFWHistory;
    public static boolean scrollSeen;
    public static boolean saveButton;
    public static boolean voteGestures;
    public static boolean colorEverywhere;
    public static boolean gif;
    public static boolean colorCommentDepth;
    public static boolean commentVolumeNav;
    public static boolean postNav;
    public static boolean cropImage;
    public static boolean smallTag;
    public static boolean typeInfoLine;
    public static boolean votesInfoLine;
    public static boolean readerMode;
    public static boolean collapseComments;
    public static boolean collapseCommentsDefault;
    public static boolean rightHandedCommentMenu;
    public static boolean abbreviateScores;
    public static boolean shareLongLink;
    public static boolean isMuted;
    public static int     subredditSearchMethod;
    public static int     backButtonBehavior;
    public static int     nightStart;
    public static int     nightEnd;
    public static int     linkHandlingMode;

    public static int previews;

    public static String synccitName;
    public static String synccitAuth;

    public static String  titleFilters;
    public static String  textFilters;
    public static String  domainFilters;
    public static final String NSFW_SUBREDDIT_FILTERS = "alexandradaddario,alexandriamorgan,alissaviolet,alysonhannigan,amanda_seyfried,amber_heard,amyadams,annakendrick,arianagrande,ashleybenson,ashleygreene,aubreyplaza,audreyhepburn,barbarapalvin,beautifulfemales,bikinisonshow,blackhairedgirls,blakelively,bravo_girls,cameronrorrison,camilamorrone,carmellarose,celeb_redheads,celebhub,celebs,celebsonshow,celestebright,celinefarach,charlyjordan,cheerleaders,chloegracemoretz,christenharper,christinahendricks,christinaricci,cindykimberly,claraalonso,classicbabes,classicscreenbeauties,classywomenofcolor,cobiesmulders,dakotafanning,daniellagrace,dashadereviankina,deniseschaefer,diannaagron,diosas,elizabethturner,elizabethzaks,ellenpage,elsiehewitt,emiliaclarke,emilyblunt,emmastone,emmawatson,evagreen,evangelinelilly,fashionmodels,fineladies,freckledgirls,gabbyepstein,geekboners,gentlemanboners,gentlemangabers,giaradionova,girls_smiling,gmbwallpapers,goddesses,gonemild,graceelizabeth,haileelautenbach,hannaedwinson,haydenpanettiere,hayleywilliams,imogenpoots,indiancelebs,instagram_girls,instathots,internetstars,janelevy,jasmine_tookes,jennafischer,jenniferaniston,jenniferlawrence,jessica_clements,jessicaalba,jessicabiel,julimery,kaleycuoco,karadeltoro,karengillan,kassismith,katebeckinsale,katyperry,kaylajones,keilahkang,keiraknightley,kelly_gale,kendalljenner,kirstendunst,kristen_stewart,kristenbell,kyra_santoro,ladakravchenko,ladyboners,ladygaga,ladyontheroad,laisribeiro,laurencohan,laurenlayne,leamichele,lorenarae,luizafreyesleben,lyndsyfonseca,madelineford,marinalaswick,matureladyboners,meganfox,melanieiglesias,melanielaurent,micheacrawford,michele_maturo,michelletrachtenberg,mila_kunis,mileycyrus,millajovovich,models,modelsgonemild,natalidanish,nataliedormer,natalieroser,nicolacavanis,nina_agdal,ninadobrev,nonnudebeauties,nsfwcelebrities,oliviamunn,oliviapickren,oliviawilde,petitebeauties,prettycowgirls,prettygirls,prettyolderwomen,rachelcook,rachelmcadams,randomsexygifs,reneemurden,rosariodawson,sarahhyland,sarahrosemcdaniel,sarahsnyder,sarahstephens,sarajunderwood,sarasampaio,savvytaylor,scarlettjohansson,scarlettleithold,selenagomez,sexycelebfemales,sexycelebs,sexygirls,sexyhair,sexywomanoftheday,sfwredheads,shelbybay,shortykeepingittight,sierra_skye,skinnywithabs,sofiajamora,sofiavergara,sophiknight,stephanierayner,stephclairesmith,summerglau,susancoffey,taylorhannum,taylormariehill,triangl,u_badabongo,u_millertime8202,u_walkedruddy,vanessahudgens,vanessamoe,veronica_zoppolo,victoriajustice,vikabronova,wallisday,wallpapernsfw,womenwithwatches,wrestlewiththeplot,ythotgirlslive,yuliarose,yvonnestrahovski,zooeydeschanel";
    public static String  subredditFilters;
    public static String  flairFilters;
    public static String  alwaysExternal;
    public static boolean loadImageLq;
    public static boolean ignoreSubSetting;
    public static boolean hideNSFWCollection;

    public static boolean fastscroll;
    public static boolean fab     = true;
    public static int     fabType = Constants.FAB_POST;
    public static boolean hideButton;
    public static boolean isPro;
    public static boolean customtabs;
    public static boolean titleTop;
    public static boolean dualPortrait;
    public static boolean singleColumnMultiWindow;
    public static int nightModeState;
    public static boolean imageSubfolders;
    public static boolean autoTime;
    public static boolean albumSwipe;
    public static boolean switchThumb;
    public static boolean bigThumbnails;
    public static boolean commentPager;
    public static boolean alphabetizeOnSubscribe;
    public static boolean colorSubName;
    public static boolean hideSelftextLeadImage;
    public static boolean overrideLanguage;
    public static boolean immersiveMode;
    public static boolean showDomain;
    public static boolean cardText;
    public static boolean alwaysZoom;
    public static boolean lqLow  = false;
    public static boolean lqMid  = true;
    public static boolean lqHigh = false;
    public static int     currentTheme; //current base theme (Light, Dark, Dark blue, etc.)
    public static int     nightTheme;
    public static boolean typeInText;
    public static String  userFilters;
    public static boolean notifSound;
    public static boolean cookies;
    public static boolean colorIcon;
    public static boolean peek;
    public static boolean largeLinks;
    public static boolean highlightCommentOP;
    public static boolean highlightTime;
    public static String  selectedBrowser;
    public static long    selectedDrawerItems;
    public static ForcedState forcedNightModeState = ForcedState.NOT_FORCED;
    public static boolean toolboxEnabled;
    public static int     removalReasonType;
    public static int     toolboxMessageType;
    public static boolean toolboxSticky;
    public static boolean toolboxLock;
    public static boolean toolboxModmail;

    public static void setAllValues(SharedPreferences settings) {
        prefs = settings;
        defaultCardView = CreateCardView.CardEnum.valueOf(
                settings.getString("defaultCardViewNew", "LARGE").toUpperCase());
        middleImage = settings.getBoolean("middleCard", false);

        bigPicCropped = settings.getBoolean("bigPicCropped", true);
        bigPicEnabled = settings.getBoolean("bigPicEnabled", true);

        colorMatchingMode = ColorMatchingMode.valueOf(
                settings.getString("ccolorMatchingModeNew", "MATCH_EXTERNALLY"));
        colorIndicator =
                ColorIndicator.valueOf(settings.getString("colorIndicatorNew", "CARD_BACKGROUND"));
        defaultSorting = Sorting.valueOf(settings.getString("defaultSorting", "HOT"));
        timePeriod = TimePeriod.valueOf(settings.getString("timePeriod", "DAY"));
        defaultCommentSorting =
                CommentSort.valueOf(settings.getString("defaultCommentSortingNew", "CONFIDENCE"));
        showNSFWContent = false;
        hideNSFWCollection = true;
        ignoreSubSetting = prefs.getBoolean(PREF_IGNORE_SUB_SETTINGS, false);

        single = prefs.getBoolean(PREF_SINGLE, false);
        readerNight = prefs.getBoolean(PREF_READER_NIGHT, false);
        blurCheck = prefs.getBoolean(PREF_BLUR, false);
        overrideLanguage = prefs.getBoolean(PREF_OVERRIDE_LANGUAGE, false);
        immersiveMode = prefs.getBoolean(PREF_IMMERSIVE_MODE, false);
        largeDepth = prefs.getBoolean(PREF_LARGE_DEPTH, false);
        readerMode = prefs.getBoolean(PREF_READER_MODE, false);
        imageSubfolders = prefs.getBoolean(PREF_IMAGE_SUBFOLDERS, false);
        isMuted = prefs.getBoolean(PREF_MUTE, false);

        commentVolumeNav = prefs.getBoolean(PREF_COMMENT_NAV, false);
        postNav = false;

        fab = prefs.getBoolean(PREF_FAB, true);
        fabType = prefs.getInt(PREF_FAB_TYPE, Constants.FAB_DISMISS);
        if (fabType > 3 || fabType < 0) {
            fabType = Constants.FAB_DISMISS;
            prefs.edit().putInt(PREF_FAB_TYPE, Constants.FAB_DISMISS).apply();
        }

        subredditSearchMethod = prefs.getInt(PREF_SUBREDDIT_SEARCH_METHOD,
                Constants.SUBREDDIT_SEARCH_METHOD_DRAWER);
        if (subredditSearchMethod > 3 || subredditSearchMethod < 0) {
            subredditSearchMethod = 1;
            prefs.edit().putInt(PREF_SUBREDDIT_SEARCH_METHOD, 1).apply();
        }

        backButtonBehavior = prefs.getInt(PREF_BACK_BUTTON_BEHAVIOR,
                Constants.BackButtonBehaviorOptions.ConfirmExit.getValue());

        highlightTime = prefs.getBoolean(PREF_HIGHLIGHT_TIME, true);

        // TODO: Remove the old pref check in a later version
        // This handles forward migration from the old night_mode boolean state
        nightModeState = prefs.getInt(PREF_NIGHT_MODE_STATE, prefs.getBoolean(PREF_NIGHT_MODE, false) ? NightModeState.MANUAL.ordinal() : NightModeState.DISABLED.ordinal());
        nightTheme = prefs.getInt(PREF_NIGHT_THEME, 0);
        autoTime = prefs.getBoolean(PREF_AUTOTHEME, false);
        colorBack = prefs.getBoolean(PREF_COLOR_BACK, false);
        cardText = prefs.getBoolean(PREF_CARD_TEXT, false);
        colorNavBar = prefs.getBoolean(PREF_COLOR_NAV_BAR, false);
        shareLongLink = prefs.getBoolean(PREF_LONG_LINK, false);
        colorEverywhere = prefs.getBoolean(PREF_COLOR_EVERYWHERE, true);
        colorCommentDepth = prefs.getBoolean(PREF_COLOR_COMMENT_DEPTH, true);
        alwaysZoom = prefs.getBoolean(PREF_ZOOM_DEFAULT, true);
        collapseComments = prefs.getBoolean(PREF_COLLAPSE_COMMENTS, false);
        collapseCommentsDefault = prefs.getBoolean(PREF_COLLAPSE_COMMENTS_DEFAULT, false);
        rightHandedCommentMenu = prefs.getBoolean(PREF_RIGHT_HANDED_COMMENT_MENU, false);
        commentAutoHide = prefs.getBoolean(PREF_AUTOHIDE_COMMENTS, false);
        showCollapseExpand = prefs.getBoolean(PREF_SHOW_COLLAPSE_EXPAND, false);
        highlightCommentOP = prefs.getBoolean(PREF_HIGHLIGHT_COMMENT_OP, true);

        typeInfoLine = prefs.getBoolean(PREF_TYPE_INFO_LINE, false);
        votesInfoLine = prefs.getBoolean(PREF_VOTES_INFO_LINE, false);
        titleTop = prefs.getBoolean(PREF_TITLE_TOP, true);

        lqLow = prefs.getBoolean(PREF_LQ_LOW, false);
        lqMid = prefs.getBoolean(PREF_LQ_MID, true);
        lqHigh = prefs.getBoolean(PREF_LQ_HIGH, false);

        noImages = prefs.getBoolean(PREF_NO_IMAGES, false);

        abbreviateScores = prefs.getBoolean(PREF_ABBREVIATE_SCORES, true);

        lowResAlways = prefs.getBoolean(PREF_LOW_RES_ALWAYS, false);
        lowResMobile = prefs.getBoolean(PREF_LOW_RES_MOBILE, false);
        loadImageLq = prefs.getBoolean(PREF_IMAGE_LQ, false);
        showDomain = prefs.getBoolean(PREF_SHOW_DOMAIN, false);
        expandedToolbar = prefs.getBoolean(PREF_EXPANDED_TOOLBAR, false);
        voteGestures = prefs.getBoolean(PREF_VOTE_GESTURES, false);
        fullCommentOverride = prefs.getBoolean(PREF_FULL_COMMENT_OVERRIDE, false);

        alphabetizeOnSubscribe = prefs.getBoolean(PREF_ALPHABETIZE_SUBSCRIBE, false);

        commentPager = prefs.getBoolean(PREF_COMMENT_PAGER, false);
        smallTag = prefs.getBoolean(PREF_SMALL_TAG, false);
        swap = prefs.getBoolean(PREF_SWAP, false);
        hideSelftextLeadImage = prefs.getBoolean(PREF_SELFTEXT_IMAGE_COMMENT, false);
        image = prefs.getBoolean(PREF_IMAGE, true);
        cache = true;
        cacheDefault = false;
        storeHistory = prefs.getBoolean(PREF_STORE_HISTORY, true);
        upvotePercentage = prefs.getBoolean(PREF_UPVOTE_PERCENTAGE, false);
        scrollSeen = prefs.getBoolean(PREF_SCROLL_SEEN, false);
        synccitName = prefs.getString(SYNCCIT_NAME, "");
        synccitAuth = prefs.getString(SYNCCIT_AUTH, "");
        notifSound = prefs.getBoolean(PREF_SOUND_NOTIFS, false);
        cookies = prefs.getBoolean(PREF_COOKIES, true);
        linkHandlingMode = prefs.getInt(PREF_LINK_HANDLING_MODE,
                SettingsHandlingFragment.LinkHandlingMode.EXTERNAL.getValue());

        previews = prefs.getInt(PREVIEWS_LEFT, 10);
        nightStart = prefs.getInt(PREF_NIGHT_START, 9);
        nightEnd = prefs.getInt(PREF_NIGHT_END, 5);

        fabComments = prefs.getBoolean(PREF_COMMENT_FAB, false);
        titleFilters = prefs.getString(PREF_TITLE_FILTERS, "");
        textFilters = prefs.getString(PREF_TEXT_FILTERS, "");
        domainFilters = prefs.getString(PREF_DOMAIN_FILTERS, "");
        subredditFilters = prefs.getString(PREF_SUBREDDIT_FILTERS, "");
        alwaysExternal = prefs.getString(SettingValues.PREF_ALWAYS_EXTERNAL, "");
        flairFilters = prefs.getString(PREF_FLAIR_FILTERS, "");
        userFilters = prefs.getString(PREF_USER_FILTERS, "");
        largeLinks = prefs.getBoolean(PREF_LARGE_LINKS, false);

        dualPortrait = prefs.getBoolean(PREF_DUAL_PORTRAIT, false);
        singleColumnMultiWindow = prefs.getBoolean(PREF_SINGLE_COLUMN_MULTI, false);
        colorSubName = prefs.getBoolean(PREF_COLOR_SUB_NAME, false);

        cropImage = prefs.getBoolean(PREF_CROP_IMAGE, true);
        switchThumb = prefs.getBoolean(PREF_SWITCH_THUMB, true);
        bigThumbnails = prefs.getBoolean(PREF_BIG_THUMBS, false);

        swipeAnywhere = true; //override this always now
        album = prefs.getBoolean(PREF_ALBUM, true);
        albumSwipe = prefs.getBoolean(PREF_ALBUM_SWIPE, true);

        commentLastVisit = prefs.getBoolean(PREF_COMMENT_LAST_VISIT, false);
        gif = prefs.getBoolean(PREF_GIF, true);
        video = true;
        fastscroll = prefs.getBoolean(PREF_FASTSCROLL, true);
        typeInText = prefs.getBoolean(PREF_TYPE_IN_TEXT, false);

        hideButton = prefs.getBoolean(PREF_HIDEBUTTON, false);
        saveButton = prefs.getBoolean(PREF_SAVE_BUTTON, false);
        actionbarVisible = prefs.getBoolean(PREF_ACTIONBAR_VISIBLE, true);
        actionbarTap = prefs.getBoolean(PREF_ACTIONBAR_TAP, false);
        colorIcon = prefs.getBoolean(PREF_COLOR_ICON, false);
        peek = prefs.getBoolean(PREF_PEEK, false);
        selectedBrowser = prefs.getString(PREF_SELECTED_BROWSER, "");
        selectedDrawerItems = prefs.getLong(PREF_SELECTED_DRAWER_ITEMS, -1);

        toolboxEnabled = prefs.getBoolean(PREF_MOD_TOOLBOX_ENABLED, false);
        removalReasonType = prefs.getInt(PREF_MOD_REMOVAL_TYPE, RemovalReasonType.SLIDE.ordinal());
        toolboxMessageType = prefs.getInt(PREF_MOD_TOOLBOX_MESSAGE, ToolboxRemovalMessageType.COMMENT.ordinal());
        toolboxSticky = prefs.getBoolean(PREF_MOD_TOOLBOX_STICKY, false);
        toolboxLock = prefs.getBoolean(PREF_MOD_TOOLBOX_LOCK, false);
        toolboxModmail = prefs.getBoolean(PREF_MOD_TOOLBOX_MODMAIL, false);
    }

    public static void setPicsEnabled(String sub, boolean checked) {
        prefs.edit().putBoolean("picsenabled" + sub.toLowerCase(Locale.ENGLISH), checked).apply();
    }

    public static void resetPicsEnabled(String sub) {
        prefs.edit().remove("picsenabled" + sub.toLowerCase(Locale.ENGLISH)).apply();
    }

    public static boolean isPicsEnabled(String subreddit) {
        if (subreddit == null) return bigPicEnabled;
        return prefs.getBoolean("picsenabled" + subreddit.toLowerCase(Locale.ENGLISH),
                bigPicEnabled);
    }

    public static boolean isSelftextEnabled(String subreddit) {
        if (subreddit == null) return cardText;
        return prefs.getBoolean("cardtextenabled" + subreddit.toLowerCase(Locale.ENGLISH),
                cardText);
    }

    public static void setSelftextEnabled(String sub, boolean checked) {
        prefs.edit()
                .putBoolean("cardtextenabled" + sub.toLowerCase(Locale.ENGLISH), checked)
                .apply();
    }

    public static boolean getIsNSFWEnabled() {
        return false;
    }

    public static void resetSelftextEnabled(String subreddit) {
        prefs.edit().remove("cardtextenabled" + subreddit.toLowerCase(Locale.ENGLISH)).apply();
    }

    public static void setDefaultCommentSorting(CommentSort commentSorting, String subreddit) {
        prefs.edit()
                .putString("defaultComment" + subreddit.toLowerCase(Locale.ENGLISH),
                        commentSorting.name())
                .apply();
    }

    public static CommentSort getCommentSorting(String sub) {
        return CommentSort.valueOf(
                prefs.getString("defaultComment" + sub.toLowerCase(Locale.ENGLISH),
                        defaultCommentSorting.name()));
    }

    public static void setSubSorting(Sorting linkSorting, TimePeriod time, String subreddit) {
        prefs.edit()
                .putString("defaultSort" + subreddit.toLowerCase(Locale.ENGLISH),
                        linkSorting.name())
                .apply();
        prefs.edit()
                .putString("defaultTime" + subreddit.toLowerCase(Locale.ENGLISH), time.name())
                .apply();
    }

    public static Sorting getSubmissionSort(String sub) {
        String subreddit = sub.toLowerCase(Locale.ENGLISH);
        if (SortingUtil.sorting.containsKey(subreddit)) {
            return SortingUtil.sorting.get(subreddit);
        } else {
            return Sorting.valueOf(prefs.getString("defaultSort" + sub.toLowerCase(Locale.ENGLISH),
                    SortingUtil.defaultSorting.name()));
        }
    }

    public static TimePeriod getSubmissionTimePeriod(String sub) {
        String subreddit = sub.toLowerCase(Locale.ENGLISH);
        if (SortingUtil.times.containsKey(subreddit)) {
            return SortingUtil.times.get(subreddit);
        } else {
            return TimePeriod.valueOf(
                    prefs.getString("defaultTime" + sub.toLowerCase(Locale.ENGLISH),
                            SortingUtil.timePeriod.name()));
        }
    }


    public static boolean isNight() {
        /* Logic for the now rather complicated night mode:
         *
         * Normal       | Forced            | Actual state
         * -----------------------------------------------------
         * Disabled     | On/Off            | Forced state
         * On           | On - gets unset   | On
         * Off          | Off - gets unset  | Off
         * On           | Off               | Off
         * Off          | On                | On
         * On/Off       | Unset             | Normal state
         *
         * Forced night mode state is intentionally not persisted between app runs and defaults to unset
         */
        if (isPro && NightModeState.isEnabled()) {
            boolean night = false;

            if (Reddit.canUseNightModeAuto && nightModeState == NightModeState.AUTOMATIC.ordinal()) {
                night = (Reddit.getAppContext().getResources().getConfiguration().uiMode
                        & Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES;
            } else if (nightModeState == NightModeState.MANUAL.ordinal()) {
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                night = hour >= nightStart + 12 || hour < nightEnd;
            }

            // unset forced state if forcing is now unnecessary - allows for normal night mode on/off transitions
            if ((night && forcedNightModeState == ForcedState.FORCED_ON)
                    || (!night && forcedNightModeState == ForcedState.FORCED_OFF)) {
                forcedNightModeState = ForcedState.NOT_FORCED;
            }

            if (forcedNightModeState == ForcedState.FORCED_ON || forcedNightModeState == ForcedState.FORCED_OFF) {
                return forcedNightModeState == ForcedState.FORCED_ON;
            } else {
                return night;
            }
        } else {
            return false;
        }
    }

    public static Sorting getBaseSubmissionSort(String sub) {
        return Sorting.valueOf(prefs.getString("defaultSort" + sub.toLowerCase(Locale.ENGLISH),
                SortingUtil.defaultSorting.name()));

    }

    public static TimePeriod getBaseTimePeriod(String sub) {
        return TimePeriod.valueOf(prefs.getString("defaultTime" + sub.toLowerCase(Locale.ENGLISH),
                SortingUtil.timePeriod.name()));

    }

    public static boolean hasSort(String subreddit) {
        return prefs.contains("defaultSort" + subreddit.toLowerCase(Locale.ENGLISH));
    }

    public enum RemovalReasonType {
        SLIDE, TOOLBOX, REDDIT
    }

    public enum ToolboxRemovalMessageType {
        COMMENT, PM, BOTH, NONE
    }

    public enum ColorIndicator {
        CARD_BACKGROUND, TEXT_COLOR, NONE

    }

    public enum ColorMatchingMode {
        ALWAYS_MATCH, MATCH_EXTERNALLY
    }

    public enum NightModeState {
        DISABLED, MANUAL, AUTOMATIC;

        public static boolean isEnabled() {
            return nightModeState != DISABLED.ordinal() || forcedNightModeState != ForcedState.NOT_FORCED;
        }
    }

    public enum ForcedState {
        NOT_FORCED, FORCED_ON, FORCED_OFF
    }
}
