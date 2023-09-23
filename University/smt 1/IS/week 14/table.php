<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>   
<body>
    <h1>Table</h1>
    <table>
        <caption> Bird Sighting</caption>
        <tr>
            <th>Name</th>
            <th>Date</th>
        </tr>
        <tr>
            <td>Bobolink</td>
            <td>5/25/10</td>
        </tr>
        <tr>
            <td>Upland Sandpiper</td>
            <td>6/03/10</td>
        </tr>
    </table>
    <?php
        $sql = "SELECT * FROM Project";
        $query = mysqli_query($db, $sql);

        while($project = mysqli_fetch_array($query)){
            echo "<tr>";

            echo "<td>".$project['ProjectID']."</td>";
            echo "<td>".$project['ProjectName']."</td>";
            echo "<td>".$project['OwnerContact']."</td>";
            echo "<td>".$project['Phone']."</td>";
            
            echo "<td>";
            echo "<a href='form-edit.php?id=".$siswa['id']."'>Edit</a> | ";
            echo "<a href='hapus.php?id=".$siswa['id']."'>Hapus</a>";
            echo "</td>";

            echo "</tr>";
        }
        ?>

    </body>
  </main>
 