# 안드로이드 스튜디오로 제작한 게임 프로젝트 입니다.

<h1> Class Diagram</h1>

![AndGameClassDiagram](https://github.com/selloriwoo/AndroidGameProject/assets/39435633/9dfaf9ee-2942-4133-bb40-dff9cab64050)


<h1>다이어그램 간략한 설명</h1><br />
  
<h3>제일 처음 StartActivity가 실행 됩니다.</h3>
<h3>-StartActivity-</h3>
  플레이어가 사용할 캐릭터를 선택합니다. 플레이어 선택후 시작 버튼 클릭시 MainActivity로 넘어가면서
  캐릭터 이미지를 넘겨줍니다.
  
<h3>-MainActivity</h3>
  아이템들의 효과음, BGM을 플레이되게 만들었습니다. 조이스틱 컨트롤러를 만들어 플레이어의 이동을 조이스틱 방향으로 가게 구현되고
  남아있는 탄 갯수를 보여주게 해주고 특수기를 사용할 수 있는 버튼을 만들어 주었습니다.
  
<h3>-PauseDialog-</h3>
  MainActivity에서 일시정지 버튼을 클릭하면 게임이 일시정되고 BGM과 효과음을 끄거나 다시 킬 수 있습니다.
  
<h3>-SpaceInvadersView-</h3>
  MainActivity에 레이아웃을 추가하여 작동하는 클래스 입니다. 게임의 시작과 종료를 구현해주었습니다. 적 캐릭터를 생성하여 적과 플레이어의 충돌을 감지하게 구현해 주었습니다.

<h3>-ResultActivity-</h3>
  SpaceInvadersView의 score를 가져와 view에 점수를 보여줍니다. 처음으로 버튼을 클릭시 StartActivity로 이동합니다.
  
<h3>-Sprite-</h3>
  AlienSprite, StarshipSprite, AlienShotSprite, SpecialshotSprite, ShotSprite의 슈퍼 클래스 이며 캐릭터의 충돌과 이동을 구현하기 위한
  캐릭터의 크기만큼 캐릭터 위치에 공간을 만들어 주었습니다.
  
<h3>-AlienSprite-</h3>
  적 외계인을 구현하는 클래스 적의 이동을 구현하고 1초마다 적이 확률로 총을 발사하게 구현했습니다. 적이 죽으면 확률적으로
  아이템들을 드랍합니다.
  
<h3>-StarshipSprite-</h3>
  플레이어가 사용하는 캐릭터를 구현하는 클래스입니다. 캐릭터가 조이스틱을 움직일 때 캐릭터가 이동합니다. 캐릭터가
  총알을 발사할 때마다 장탄수가 줄어들게 하고 재장전이 가능하게 구현하였습니다. 또한  특수기를 구현하여 지속시간동안 닿는 적을
  소멸시키게 했습니다. 플레이어의 생명을 가지고 적, 적의 총알의 충돌이 발생하면 생명을 잃게 되어 있습니다.
  아이템을 얻으면 그에 따른 효과가 발생합니다.
  
<h3>-AlienShotSprite-</h3>
  적의 개체의 위치를 반영하여 총 발사시 적 위치 기준으로 발사가 되게 구현 합니다.
  
<h3>-SpecialshotSprite-</h3>
  플레이어의 특수기 지속시간을 지정해주며 이동할 때마다 특수기도 또한 함께 움직이게 했습니다.
  
<h3>-ShotSprite-</h3>
  플레이어의 위치를 가져와 플레이어 캐릭터 위치에서 발사하게 기준을 잡아주는 클래스입니다.
  
<h3>-(Speed, Heal, Power)ItemSprite-</h3>
  기능이 같은 클래스들이며 아이템이 적이 죽은 위치를 기준으로 잡아줍니다. 또한 아이템의 움직임을 구현합니다.
  
<h1>Play Video (Click Image)</h1>
[![Video Label](http://img.youtube.com/vi/tIr41V6YZfw/0.jpg)](https://youtu.be/tIr41V6YZfw) 
