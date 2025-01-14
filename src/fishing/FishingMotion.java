package fishing;

import java.util.Random;

public class FishingMotion {
	
	private static FishingMotion instance;
	
	private FishingMotion() {};
	
	public static FishingMotion getInstance() {
		if(instance == null) {
			instance = new FishingMotion();
		}
		return instance;
	}
	
	public void fishingAni() {
		Random rand = new Random();
		int ranNum = rand.nextInt(1)+2;
        final int sleepTime = 800; // millisecond
        for (int i = 0; i < ranNum; i++) {
            try {
            	System.out.println("\r\n"
            			+ "\r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "              -,,..                               \r\n"
            			+ "              : .,,-,                             \r\n"
            			+ "             , ..  .,~-                           \r\n"
            			+ "                 ..  .-:                          \r\n"
            			+ "            ,       ,.,;;                         \r\n"
            			+ "                       .-:                        \r\n"
            			+ "           .            .:~                       \r\n"
            			+ "           .              :~                      \r\n"
            			+ "                        ., ;-                     \r\n"
            			+ "          ..              ..!.                    \r\n"
            			+ "                           .,*                    \r\n"
            			+ "                            !-;                   \r\n"
            			+ "                            :.*,                  \r\n"
            			+ "          .                   -!                  \r\n"
            			+ "          .                  ..;~                 \r\n"
            			+ "          .                  . -!.                \r\n"
            			+ "          .                   , ;~                \r\n"
            			+ "          .                   . -*.               \r\n"
            			+ "          .                    ..*~               \r\n"
            			+ "                                 ~#               \r\n"
            			+ "          .                       =~              \r\n"
            			+ "                                  :@              \r\n"
            			+ "          ..                       #~             \r\n"
            			+ "                                   :$             \r\n"
            			+ "           ,.                       #-            \r\n"
            			+ "           .                        ==            \r\n"
            			+ "            -                       .#,           \r\n"
            			+ "            .                        $!           \r\n"
            			+ "             ,.                     -==.          \r\n"
            			+ "             .- .                  .###~          \r\n"
            			+ "              ..,                 -*@$@!          \r\n"
            			+ "                                 ~=!:;*=.         \r\n"
            			+ "                                 ,-. .!@$,        \r\n"
            			+ "                                     ,#@$,        \r\n"
            			+ "                                      ~#@-        \r\n"
            			+ "                                      .*@:        \r\n"
            			+ "                                       ;@*        \r\n"
            			+ "                                       ~##.       \r\n"
            			+ "                                       ,$@,       \r\n"
            			+ "                                        *@:       \r\n"
            			+ "                                        ;@$       \r\n"
            			+ "                                        ~#@.      \r\n"
            			+ "                                        .$@~      \r\n"
            			+ "                                         *@;      \r\n"
            			+ "                                         -!-      \r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "");
                Thread.sleep(sleepTime);
            	System.out.println("\r\n"
            			+ "\r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "              -,,..                               \r\n"
            			+ "              : .,,-,                             \r\n"
            			+ "             , ..  .,~-                           \r\n"
            			+ "                 ..  .-:                          \r\n"
            			+ "            ,       ,.,;;                         \r\n"
            			+ "                       .-:                        \r\n"
            			+ "           .            .:~                       \r\n"
            			+ "           .              :~                      \r\n"
            			+ "                        ., ;-                     \r\n"
            			+ "          ..              ..!.                    \r\n"
            			+ "                           .,*                    \r\n"
            			+ "                            !-;                   \r\n"
            			+ "                            :.*,                  \r\n"
            			+ "          .                   -!                  \r\n"
            			+ "          .                  ..;~                 \r\n"
            			+ "          .                  . -!.                \r\n"
            			+ "          .                   , ;~                \r\n"
            			+ "          .                   . -*.               \r\n"
            			+ "          .                    ..*~               \r\n"
            			+ "                                 ~#               \r\n"
            			+ "         .                        =~              \r\n"
            			+ "                                  :@              \r\n"
            			+ "        ..                         #~             \r\n"
            			+ "                                   :$             \r\n"
            			+ "       ,.                           #-            \r\n"
            			+ "       .                            ==            \r\n"
            			+ "      -                             .#,           \r\n"
            			+ "     .                               $!           \r\n"
            			+ "    ,.                              -==.          \r\n"
            			+ "  .- .                             .###~          \r\n"
            			+ "  ..,                             -*@$@!          \r\n"
            			+ "                                 ~=!:;*=.         \r\n"
            			+ "                                 ,-. .!@$,        \r\n"
            			+ "                                     ,#@$,        \r\n"
            			+ "                                      ~#@-        \r\n"
            			+ "                                      .*@:        \r\n"
            			+ "                                       ;@*        \r\n"
            			+ "                                       ~##.       \r\n"
            			+ "                                       ,$@,       \r\n"
            			+ "                                        *@:       \r\n"
            			+ "                                        ;@$       \r\n"
            			+ "                                        ~#@.      \r\n"
            			+ "                                        .$@~      \r\n"
            			+ "                                         *@;      \r\n"
            			+ "                                         -!-      \r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "                                                  \r\n"
            			+ "");
            	Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted.");
            }
        }

	}
	
	public void fishingFinishAni() {
        final int sleepTime = 500; // millisecond
            try {
            	System.out.println("\r\n"
            			+ "\r\n"
            			+ "                -. .                                 \r\n"
            			+ "                .,..,.                               \r\n"
            			+ "                . ..,,,.                             \r\n"
            			+ "                .    ,.,.                            \r\n"
            			+ "                .    -  ,,                           \r\n"
            			+ "                .    -.  ,,                          \r\n"
            			+ "                .     ,   ,,                         \r\n"
            			+ "                .     .,.  ,,                        \r\n"
            			+ "                .      .,,,,~,                       \r\n"
            			+ "                .        ...~-,                      \r\n"
            			+ "                .           ,.-.                     \r\n"
            			+ "                .          .. ,,                     \r\n"
            			+ "                .           , .-,                    \r\n"
            			+ "                .           -  ,-                    \r\n"
            			+ "                            ., .-,                   \r\n"
            			+ "                             ,, ,-                   \r\n"
            			+ "                              ,, -,                  \r\n"
            			+ "                ,-.            .,-~                  \r\n"
            			+ "                ~;.             .-~.                 \r\n"
            			+ "                 .  ..           .-~                 \r\n"
            			+ "           .........  .          ..~.                \r\n"
            			+ "           ......     .,.        . ~-                \r\n"
            			+ "          ,.          .--,       . ,~                \r\n"
            			+ "         .,           .---       .  ~,               \r\n"
            			+ "                   ....,,,       .  ~-               \r\n"
            			+ "            ........              . --               \r\n"
            			+ "              ..                  , .~,              \r\n"
            			+ "                  ...             ~  ~-              \r\n"
            			+ "              .......             ~  ~-              \r\n"
            			+ "               ....               .  --.             \r\n"
            			+ "              .----,               - .~,             \r\n"
            			+ "              ------,              - .~,             \r\n"
            			+ "              --,,---               ~.~,             \r\n"
            			+ "              --, ,--.             ,:-~-             \r\n"
            			+ "              ,,   ..             :===!:,            \r\n"
            			+ "                                  *===$$~            \r\n"
            			+ "                                  *===$$~            \r\n"
            			+ "                                  :===$$~            \r\n"
            			+ "                                   -~~$$~            \r\n"
            			+ "                                    ,$$~             \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "                                     .!=-            \r\n"
            			+ "                                      .,             \r\n"
            			+ "                                                     \r\n"
            			+ "                                                     \r\n"
            			+ "");
                Thread.sleep(sleepTime); // 대기 시간
            	System.out.println("\r\n"
            			+ "\r\n"
            			+ "                -. .                                 \r\n"
            			+ "                .,..,.                               \r\n"
            			+ "                . ..,,,.                             \r\n"
            			+ "                .    ,.,.                            \r\n"
            			+ "                .    -  ,,                           \r\n"
            			+ "                .    -.  ,,                          \r\n"
            			+ "                .     ,   ,,                         \r\n"
            			+ "                .     .,.  ,,                        \r\n"
            			+ "                .      .,,,,~,                       \r\n"
            			+ "                .        ...~-,                      \r\n"
            			+ "                .           ,.-.                     \r\n"
            			+ "                .          .. ,,                     \r\n"
            			+ "                .           , .-,                    \r\n"
            			+ "                .           -  ,-                    \r\n"
            			+ "                            ., .-,                   \r\n"
            			+ "                             ,, ,-                   \r\n"
            			+ "                              ,, -,                  \r\n"
            			+ "                ,-.            .,-~                  \r\n"
            			+ "                ~;.             .-~.                 \r\n"
            			+ "                 .  ..           .-~                 \r\n"
            			+ "           .........  .          ..~.                \r\n"
            			+ "           ......     .,.        . ~-                \r\n"
            			+ "          ,.          .--,       . ,~                \r\n"
            			+ "         .,           .---       .  ~,               \r\n"
            			+ "                   ....,,,       .  ~-               \r\n"
            			+ "            ........              . --               \r\n"
            			+ "              ..                  , .~,              \r\n"
            			+ "                  ...             ~  ~-              \r\n"
            			+ "              .......             ~  ~-              \r\n"
            			+ "               ....               .  --.             \r\n"
            			+ "              .----,               - .~,             \r\n"
            			+ "              ------,              - .~,             \r\n"
            			+ "              --,,---               ~.~,             \r\n"
            			+ "              --, ,--.             ,:-~-             \r\n"
            			+ "              ,,   ..             :===!:,            \r\n"
            			+ "                                  *===$$~            \r\n"
            			+ "       .                          *===$$~            \r\n"
            			+ "      ...                         :===$$~            \r\n"
            			+ "      ..         .                 -~~$$~            \r\n"
            			+ "                ...                 ,$$~             \r\n"
            			+ "                 ..                  .$$~            \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "                                     .$$~            \r\n"
            			+ "           .                         .$$~            \r\n"
            			+ "          ..                         .!=-            \r\n"
            			+ "           ..                         .,             \r\n"
            			+ "                                                     \r\n"
            			+ "                                                     \r\n"
            			+ "");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 인터럽트 상태 복원
                System.err.println("Thread was interrupted.");
            }
            
	// 게임 끝내기 모션
	}
}
